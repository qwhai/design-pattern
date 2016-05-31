package org.design.pattern.builder.builder;

import java.util.List;

import org.design.pattern.builder.part.Equipment;
import org.design.pattern.builder.part.Level;
import org.design.pattern.builder.part.Skill;

/**
 * <p>
 * 英雄构建类的通用接口
 * </p>
 * 2015年12月11日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1
 */
public interface HeroBuilder {

    public HeroBuilder userName(String _name);
    
    public HeroBuilder level(Level _level);
    
    public HeroBuilder skills(List<Skill> _skills);
    
    public HeroBuilder equipments(List<Equipment> _equipments);
}
