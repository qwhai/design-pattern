package org.design.pattern.iterator.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.design.pattern.iterator.bean.MenuItem;
import org.design.pattern.iterator.interf.Menu;

/**
 * <p>
 * 早餐的菜单
 * </p>
 * 2016年3月4日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1.1
 */
public class BreakfastMenu implements Menu {

    private List<MenuItem> menuItems = null;
    
    public BreakfastMenu() {
        menuItems = new ArrayList<>();
    }
    
    public void addNewMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
