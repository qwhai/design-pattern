package org.design.pattern.iterator.impl;

import java.util.Iterator;

import org.design.pattern.iterator.bean.MenuItem;
import org.design.pattern.iterator.interf.Menu;

/**
 * <p>
 * 餐厅女招待
 * </p>
 * 2016年3月4日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1.1
 */
public class Waitress {

    private Iterator<MenuItem> iterator = null;
    private Menu menu = null;
    
    public Waitress(Menu _menu) {
        this.menu = _menu;
    }
    
    public void printMenu() {
        System.out.println("\n菜单：");
        iterator = menu.createIterator();
        do {
            System.out.println(iterator.next());
        } while (iterator.hasNext());
    }
}
