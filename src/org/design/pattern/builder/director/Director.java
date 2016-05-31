package org.design.pattern.builder.director;

import java.util.List;

import org.design.pattern.builder.builder.HeroBuilder;
import org.design.pattern.builder.part.Equipment;
import org.design.pattern.builder.part.Level;
import org.design.pattern.builder.part.Skill;

/**
 * <p>
 * 部件组装类
 * </p>
 * 2015年12月11日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1
 */
public class Director {

    private HeroBuilder builder = null;
    
    public Director(HeroBuilder _builder) {
        builder = _builder;
    }
    
    public void construct(String _playerName, Level _level, List<Skill> _skills, List<Equipment> _equipments) {
        builder
            .userName(_playerName)
            .level(_level)
            .skills(_skills)
            .equipments(_equipments);
    }
}
