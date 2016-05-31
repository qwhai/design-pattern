package org.design.pattern.builder.client;

import java.util.ArrayList;
import java.util.List;

import org.design.pattern.builder.builder.TraxexBuilder;
import org.design.pattern.builder.director.Director;
import org.design.pattern.builder.hero.Traxex;
import org.design.pattern.builder.part.Equipment;
import org.design.pattern.builder.part.Level;
import org.design.pattern.builder.part.Skill;

/**
 * <p>
 * 客户端测试类
 * </p>
 * 2015年12月10日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1
 */
public class BuilderClient {

    public static void main(String[] args) {
        // 技能定义
        List<Skill> skills = getSkills();
        
        // 装备定义
        List<Equipment> equipments = getEquipments();
        
        // 构建对象
        TraxexBuilder builder = new TraxexBuilder();
        Director director = new Director(builder);
        director.construct("Naga007", Level.Level_19, skills, equipments);
        Traxex traxex = builder.build();
        
        System.out.println(traxex);
    }
    
    // 创建技能列表
    private static List<Skill> getSkills() {
        List<Skill> skills = new ArrayList<>();
        skills.add(Skill.IceArrow);
        skills.add(Skill.SilentMagic);
        skills.add(Skill.TrueshotAura);
        skills.add(Skill.ArcherTalent);
        
        return skills;
    }
    
    // 创建装备列表
    private static List<Equipment> getEquipments() {
        List<Equipment> equipments = new ArrayList<>();
        equipments.add(Equipment.Fly);
        equipments.add(Equipment.Avatar);
        equipments.add(Equipment.Cannon);
        equipments.add(Equipment.Invisible);
        equipments.add(Equipment.BKB);
        equipments.add(Equipment.TrueEye);
        
        return equipments;
    }
}
