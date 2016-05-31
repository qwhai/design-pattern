package org.design.pattern.composite;

import java.util.Iterator;

/**
 * <p>
 * 女服务员进行菜单打印
 * </p>
 * Create Date: 2016年5月17日
 * Last Modify: 2016年5月17日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.0.1
 */
public class Waitress {

    private MenuComponent menu = null;
    
    public Waitress(MenuComponent _menu) {
        this.menu = _menu;
    }
    
    public void printMenu() {
        menu.print();
    }
    
    /**
     * 基于迭代器打印所有素食菜单
     * TODO
     */
    @SuppressWarnings("rawtypes")
    public void printVegetarMenu() {
        Iterator iterator = menu.createIterator();
        System.out.println("\n素食菜单（迭代）");
        while (iterator.hasNext()) {
            MenuComponent component = (MenuComponent) iterator.next();
            try {
                if (component.isVegetarian()) {
                    component.print();
                }
            } catch (UnsupportedOperationException e) {
//                System.err.println("---");
            }
        }
    }
    
    /**
     * 基于树的深度搜索打印所有素食菜单
     */
    public void showVegetarMenu() {
        AppUtils appUtils = new AppUtils();
        System.out.println("\n素食菜单（深搜）");
        appUtils.showVegetarMenu(menu);
    }
}
