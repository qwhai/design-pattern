package org.design.pattern.adapter;

/**
 * <p>
 * 适配器
 * </p>
 * <p>
 * 各个颜色都通用
 * </p>
 * 2015年12月16日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1
 */
public class ColorAdapter implements ColorRed, ColorBlack {

    private ColorBlack black;
    private ColorRed red;
    
    public ColorAdapter(ColorBlack _pencil) {
        black = _pencil;
    }
    
    public ColorAdapter(ColorRed _pencil) {
        red = _pencil;
    }
    
    @Override
    public void drawBlack(String word) {
        red.drawRed(word);
    }

    @Override
    public void drawRed(String word) {
        black.drawBlack(word);
    }
}