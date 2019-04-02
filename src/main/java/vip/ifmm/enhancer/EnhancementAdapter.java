package vip.ifmm.enhancer;

/**
 * <p>An interface that provides methods for adding user-defined enhancements.
 * The user implements the required actions through method overrides</p>
 * @author: MackyHuang
 * @eamil: 973151766@qq.com
 */
public interface EnhancementAdapter {

    /**
     * <p>Enhancement method executed before the original method</p>
     */
    void preInvoke();

    /**
     * <p>Enhancement method executed after the original method</p>
     */
    void postInvoke();
}
