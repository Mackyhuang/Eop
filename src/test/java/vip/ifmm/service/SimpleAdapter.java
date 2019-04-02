package vip.ifmm.service;

import vip.ifmm.enhancer.EnhancementAdapter;

/**
 * @author: MackyHuang
 * @eamil: 973151766@qq.com
 * @createTime: 2019/4/2 12:21
 */
public class SimpleAdapter implements EnhancementAdapter {
    @Override
    public void preInvoke() {
        System.out.println("Hi! here is pre adapter");
    }

    @Override
    public void postInvoke() {
        System.out.println("Hi! here is post adapter");
    }
}
