package org.design.pattern.flyweight.impl;

import org.design.pattern.flyweight.interf.Flyweight;

/**
 * <p>
 * 不共享的对象
 * </p>
 * Create Date: 2016年4月25日
 * Last Modify: 2016年4月25日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1.1
 */
public class UnsharedConcreteFlyweight implements Flyweight {

    private String intrinsicState = null;
    
    public UnsharedConcreteFlyweight(String _intrinsicState) {
        this.intrinsicState = _intrinsicState;
    }
    
    @Override
    public void operation(String extrinsicState) {
        System.out.println("内蕴状态：" + intrinsicState);
        System.out.println("外蕴状态：" + extrinsicState);
    }

}
