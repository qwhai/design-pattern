package org.design.pattern.adapter2;

/**
 * <p>
 * 采用匿名类的方式实现天灾军团的适配器
 * </p>
 * 2016年1月5日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1
 */
public class DisguiserAdapter2 implements DisasterHero {

    // 持有一个近卫军团的对象
    private KonoeHero hero;
    
    public DisguiserAdapter2() {
        initEvent();
    }
    
    private void initEvent() {
        if (hero == null) {
            hero = new KonoeHero() {
                
                @Override
                public void protectWorldTree() {
                    System.out.println("我是近卫军，我在攻击冰封王座。");
                }
                
                @Override
                public void attackFrozenThrone() {
                    System.out.println("我是近卫军，我在保护世界之树。");
                }
            };
        }
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
