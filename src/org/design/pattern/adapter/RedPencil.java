package org.design.pattern.adapter;

/**
 * <p>
 * 红颜色的笔
 * </p>
 * 2015年12月16日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1
 */
public class RedPencil implements ColorRed {

    @Override
    public void drawRed(String word) {
        System.err.println("用红笔写下了" + word);
    }
    
}