package vip.ifmm.enhancer;

/**
 * <p>An interface that provides methods for adding user-defined enhancements.
 * The user implements the required actions through method overrides</p>
 * @author: MackyHuang
 * @eamil: 973151766@qq.com
 */
public interface EnhancementAdapter {

    void preInvoke();

    void postInvoke();
}
