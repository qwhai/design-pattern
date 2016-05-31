package org.design.pattern.proxy.reflect;

import org.utils.naga.nums.RandomUtils;

/**
 * <p>
 * 小学生
 * </p>
 * 2015年12月17日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1
 */
public class Pupil implements Student {

    private String name = "";
    private int score = 0;
    
    public Pupil(String _name) {
        name = _name;
    }
    
    @Override
    public void examinate() {
        score = new RandomUtils().nextInt(40, 100);
    }

    @SuppressWarnings("unused")
    private void cheat() {
        System.out.println(name + "正在作弊...嘘...");
        score += (new RandomUtils(100 - score).nextInt());
    }

    @Override
    public void announce() {
        System.out.println(name + "考了" + score + "分");
    }
}
