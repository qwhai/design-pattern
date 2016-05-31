package org.design.pattern.builder.hero;

import java.util.List;

import org.design.pattern.builder.part.Equipment;
import org.design.pattern.builder.part.Level;
import org.design.pattern.builder.part.Skill;

/**
 * <p>
 * DotA英雄的抽象接口
 * </p>
 * 2015年12月11日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1
 */
public interface Hero {

    public void setUserName(String name);

    public void setLevel(Level level);
    
    public void setSkill(List<Skill> skills);
    
    public void setEquipment(List<Equipment> equipments);
    
}
