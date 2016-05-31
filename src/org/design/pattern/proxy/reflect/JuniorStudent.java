package org.design.pattern.proxy.reflect;

import org.utils.naga.nums.RandomUtils;

/**
 * <p>
 * 初中生
 * </p>
 * 2015年12月17日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1
 */
public class JuniorStudent implements Student {

    private String name = "";
    private int score = 0;
    
    public JuniorStudent(String _name) {
        name = _name;
    }
    
    @Override
    public void examinate() {
        score = new RandomUtils(120).nextInt();
    }

    @SuppressWarnings("unused")
    private void cheat() {
        System.out.println(name + "正在作弊...嘘...");
        score += (new RandomUtils(120 - score).nextInt());
    }

    @Override
    public void announce() {
        System.out.println(name + "考了" + score + "分");
    }

}
