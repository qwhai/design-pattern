package org.design.pattern.builder.part;

/**
 * <p>
 * 装备枚举类
 * </p>
 * 2015年12月10日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1
 */
public enum Equipment {

    Avatar("分身"), Cannon("大炮"), Invisible("隐身斧"), Fly("飞鞋"), BKB("魔法免疫"), TrueEye("真视眼睛");
    
    private String desc;
    
    private Equipment(String _desc) {
        desc = _desc;
    }
    
    public String getDesc() {
        return desc;
    }
}
