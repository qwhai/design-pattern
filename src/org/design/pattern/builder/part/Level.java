package org.design.pattern.builder.part;

/**
 * <p>
 * 等级枚举类
 * </p>
 * <p>
 * 这里对等级使用枚举是因为，等级的限制只有1到25级。用枚举最适合
 * </p>
 * 2015年12月10日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1
 */
public enum Level {

    Level_1("Level 1"), Level_2("Level 2"), Level_3("Level 3"), Level_4("Level 4"), Level_5("Level 5"), 
    Level_6("Level 6"), Level_7("Level 7"), Level_8("Level 8"), Level_9("Level 9"), Level_10("Level 10"), 
    Level_11("Level 11"), Level_12("Level 12"), Level_13("Level 13"), Level_14("Level 14"), Level_15("Level 15"),
    Level_16("Level 16"), Level_17("Level 17"), Level_18("Level 18"), Level_19("Level 19"), Level_20("Level 20"),
    Level_21("Level 21"), Level_22("Level 22"), Level_23("Level 23"), Level_24("Level 24"), Level_25("Level 25");
    
    private String desc;
    
    private Level(String _desc) {
        desc = _desc;
    }
    
    public String getDesc() {
        return desc;
    }
}
