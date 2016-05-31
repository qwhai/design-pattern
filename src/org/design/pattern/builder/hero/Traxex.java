package org.design.pattern.builder.hero;

import java.util.List;

import org.design.pattern.builder.builder.TraxexBuilder;
import org.design.pattern.builder.part.Equipment;
import org.design.pattern.builder.part.Level;
import org.design.pattern.builder.part.Skill;

/**
 * <p>
 * DotA英雄:崔希丝
 * </p>
 * 2015年12月10日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1
 */
public class Traxex implements Hero {

    private String userName; // 玩家id
    private Level level; // 玩家等级
    private List<Skill> skills; // 学习技能点
    private List<Equipment> equipments; // 当前装备
    
    @Override
    public void setUserName(String name) {
        this.userName = name;
    }

    @Override
    public void setLevel(Level _level) {
        this.level = _level;
    }

    @Override
    public void setSkill(List<Skill> _skills) {
        this.skills = _skills;
    }

    @Override
    public void setEquipment(List<Equipment> _equipments) {
        this.equipments = _equipments;
    }
    
    private String getUserName() {
        return userName;
    }

    private Level getLevel() {
        return level;
    }

    private List<Skill> getSkills() {
        return skills;
    }

    private List<Equipment> getEquipments() {
        return equipments;
    }
    
    public Traxex(TraxexBuilder _builder) {
        setUserName(_builder.userName);
        setLevel(_builder.level);
        setSkill(_builder.skills);
        setEquipment(_builder.equipments);
    }

    @Override
    public String toString() {
        String level = getLevel().getDesc();
        
        String skillDesc = "[";
        boolean firstFlag = true;
        for (Skill skill : getSkills()) {
            if (firstFlag) {
                firstFlag = false;
            } else {
                skillDesc += ", ";
            }
            
            skillDesc += skill.getDesc();
        }
        skillDesc += "]";
        
        String equipmentDesc = "[";
        firstFlag = true;
        for (Equipment equipment : getEquipments()) {
            if (firstFlag) {
                firstFlag = false;
            } else {
                equipmentDesc += ", ";
            }
            
            equipmentDesc += equipment.getDesc();
        }
        equipmentDesc += "]";
        
        return "玩家：" + getUserName() + "\n等级：" + level + "\n学习技能：" + skillDesc + "\n当前装备：" + equipmentDesc;
    }
}
