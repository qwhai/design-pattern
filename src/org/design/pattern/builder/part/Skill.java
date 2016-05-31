package org.design.pattern.builder.part;

/**
 * <p>
 * 英雄技能枚举
 * </p>
 * 2015年12月10日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1
 */
public enum Skill {

    IceArrow("霜冻之箭(R)"), SilentMagic("沉默魔法(E)"), TrueshotAura("强击光环(T)"), ArcherTalent("射手天赋(M)");
    
    private String desc;
    
    private Skill(String _desc) {
        desc = _desc;
    }
    
    public String getDesc() {
        return desc;
    }
}
