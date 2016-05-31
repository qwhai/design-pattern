package org.design.pattern.iterator.impl;

import java.util.Iterator;

import org.design.pattern.iterator.bean.MenuItem;

/**
 * <p>
 * 午餐菜单迭代器
 * 用于对数组的迭代
 * </p>
 * 2016年3月4日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1.1
 */
public class LunchIterator implements Iterator<MenuItem> {

    private MenuItem[] menuItems = null;
    private int position = 0;
    
    public LunchIterator(MenuItem[] _menuItems) {
        this.menuItems = _menuItems;
    }
    
    @Override
    public boolean hasNext() {
        if (menuItems == null) {
            return false;
        }
        
        return position < menuItems.length;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }
}
