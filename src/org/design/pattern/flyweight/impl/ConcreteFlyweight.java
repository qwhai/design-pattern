package org.design.pattern.flyweight.impl;

import org.design.pattern.flyweight.interf.Flyweight;

/**
 * <p>
 * ConcreteFlyweight 必须是可共享的，它保存的任何状态都必须是内部(intrinsic),
 * </p>
 * <p>
 * 也就是说, ConcreteFlyweight 必须和它的应用环境场合无关.
 * </p>
 * Create Date: 2016年4月25日 Last Modify: 2016年4月25日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/
 *      lemon_tree12138</a>
 * @version 0.1.1
 */
public class ConcreteFlyweight implements Flyweight {

    private String intrinsicState = null;

    /**
     * 构造函数，内蕴状态作为参数传入
     * 
     * @param state
     */
    public ConcreteFlyweight(String _intrinsicState) {
        this.intrinsicState = _intrinsicState;
    }

    /**
     * 外蕴状态作为参数传入方法中，改变方法的行为， 但是并不改变对象的内蕴状态。
     */
    @Override
    public void operation(String extrinsicState) {
        System.out.println("内蕴状态：" + intrinsicState);
        System.out.println("外蕴状态：" + extrinsicState);
    }

}
