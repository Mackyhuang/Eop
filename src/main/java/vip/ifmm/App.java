package vip.ifmm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import vip.ifmm.aspect.RecordlogAspect;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("properties/applicationContext.xml");
        Object recordlogAspect = ctx.getBean(RecordlogAspect.class);
        System.out.println(recordlogAspect.getClass().toString());
    }
}
