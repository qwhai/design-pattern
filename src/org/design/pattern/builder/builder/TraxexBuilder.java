package org.design.pattern.builder.builder;

import java.util.List;

import org.design.pattern.builder.hero.Traxex;
import org.design.pattern.builder.part.Equipment;
import org.design.pattern.builder.part.Level;
import org.design.pattern.builder.part.Skill;

/**
 * <p>
 * 具体构建者，构建一个崔希丝
 * </p>
 * 2015年12月11日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1
 */
public class TraxexBuilder implements HeroBuilder {

    private Traxex traxex;
    
    public String userName; // 玩家id
    public Level level; // 玩家等级
    public List<Skill> skills; // 学习技能点
    public List<Equipment> equipments; // 当前装备
    
    @Override
    public HeroBuilder userName(String _name) {
        userName = _name;
        return this;
    }
    @Override
    public HeroBuilder level(Level _level) {
        level = _level;
        return this;
    }
    @Override
    public HeroBuilder skills(List<Skill> _skills) {
        skills = _skills;
        return this;
    }
    @Override
    public HeroBuilder equipments(List<Equipment> _equipments) {
        equipments = _equipments;
        return this;
    }

    public Traxex build() {
        if (traxex == null) {
            traxex = new Traxex(this);
        }
        
        return traxex;
    }
}
