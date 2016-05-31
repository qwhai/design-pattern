package org.design.pattern.adapter2;

/**
 * <p>
 * 崔希丝是属于近卫军团的
 * </p>
 * 2015年12月16日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1
 */
public class Traxex implements KonoeHero {

    @Override
    public void attackFrozenThrone() {
        System.out.println("我是" + Traxex.class.getSimpleName() + "，我在攻击冰封王座。");
    }

    @Override
    public void protectWorldTree() {
        System.out.println("我是" + Traxex.class.getSimpleName() + "，我在保护世界之树。");
    }

}
