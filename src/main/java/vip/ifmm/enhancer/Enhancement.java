package vip.ifmm.enhancer;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * <p>This is where you manage your <strong>enhancement objects</strong> and <strong>enhancement methods</strong> and <strong>enhancement annotation</strong></p>
 * <P>and building this class requires the three sections mentioned above</P>
 * <p>enhancement methods needs to implement an interface {@link EnhancementAdapter}</p>
 * @author: MackyHuang
 * @eamil: 973151766@qq.com
 */
public class Enhancement implements MethodInterceptor {

    //增强对象
    private Object target;
    //增强方法
    private EnhancementAdapter adapter;
    //增强注解
    private Class annotation;

    public Object bind(Object target, EnhancementAdapter adapter, Class annotation){
        this.target = target;
        this.adapter = adapter;
        this.annotation = annotation;

        //创建增强器
        Enhancer enhancer = new Enhancer();
        //告知增强对象
        enhancer.setSuperclass(this.target.getClass());
        //设置回调，代理类上的方法调用时会调用Callback -> 需要实现intercept
        enhancer.setCallback(this);
        //返回动态代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        //获取代理类所执行方法的指定注解
        Annotation hasAnnotation = method.getAnnotation(this.annotation);
        //若指定注解为空 则无需使用增强方法，直接执行原本的方法
        if (hasAnnotation == null){
            return proxy.invokeSuper(obj, args);
        }
        //执行 前 增强
        adapter.preInvoke();
        //调用实际的业务方法
        Object result = proxy.invokeSuper(obj, args);
        //执行 后 增强
        adapter.preInvoke();
        return result;
    }
}
