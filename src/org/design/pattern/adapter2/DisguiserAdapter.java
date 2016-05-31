package org.design.pattern.adapter2;

/**
 * <p>
 * 天灾军团的适配器
 * </p>
 * 2015年12月16日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1
 */
public class DisguiserAdapter implements DisasterHero {

    // 持有一个近卫军团的对象
    private KonoeHero hero;
    
    public DisguiserAdapter(KonoeHero _hero) {
        hero = _hero;
    }
    
    @Override
    public void protectFrozenThrone() {
        hero.attackFrozenThrone();
    }

    @Override
    public void attackWorldTree() {
        hero.protectWorldTree();
    }

}
