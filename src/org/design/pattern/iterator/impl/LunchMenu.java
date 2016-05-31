package org.design.pattern.iterator.impl;

import java.util.Iterator;

import org.design.pattern.iterator.bean.MenuItem;
import org.design.pattern.iterator.interf.Menu;

/**
 * <p>
 * 午餐的菜单
 * </p>
 * 2016年3月4日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1.1
 */
public class LunchMenu implements Menu {

    private MenuItem[] menuItems = null;
    
    public LunchMenu() {
        menuItems = new MenuItem[5];
        initMenu();
    }
    
    private void initMenu() {
        menuItems[0] = new MenuItem("红烧肉", 10.0);
        menuItems[1] = new MenuItem("带鱼", 12.0);
        menuItems[2] = new MenuItem("土豆丝", 6.0);
        menuItems[3] = new MenuItem("鸡腿", 9.0);
        menuItems[4] = new MenuItem("红烧鱼", 10.0);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new LunchIterator(menuItems);
    }
}
