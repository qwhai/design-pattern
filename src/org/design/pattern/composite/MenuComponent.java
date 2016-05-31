package org.design.pattern.composite;

import java.util.Iterator;

/**
 * <p>
 * 抽象菜单类
 * </p>
 * Create Date: 2016年5月17日
 * Last Modify: 2016年5月17日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.0.3
 */
public abstract class MenuComponent {

    public String getName() {
        throw new UnsupportedOperationException("暂不支持此操作");
    }

    public String getDescription() {
        throw new UnsupportedOperationException("暂不支持此操作");
    }

    public double getPrice() {
        throw new UnsupportedOperationException("暂不支持此操作");
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException("暂不支持此操作");
    }

    public void print() {
        throw new UnsupportedOperationException("暂不支持此操作");
    }

    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("暂不支持此操作");
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("暂不支持此操作");
    }

    public MenuComponent getChild(int childIndex) {
        throw new UnsupportedOperationException("暂不支持此操作");
    }
    
    public abstract Iterator<MenuComponent> createIterator();
}
