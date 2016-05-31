package org.design.pattern.adapter2;

/**
 * <p>
 * 幽鬼是属于天灾军团的
 * </p>
 * 2015年12月16日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1
 */
public class Mercurial implements DisasterHero {

    @Override
    public void protectFrozenThrone() {
        System.out.println("我是" + Mercurial.class.getSimpleName() + "，我在保护冰封王座。");
    }

    @Override
    public void attackWorldTree() {
        System.out.println("我是" + Mercurial.class.getSimpleName() + "，我在攻击世界之树。");
    }

}
