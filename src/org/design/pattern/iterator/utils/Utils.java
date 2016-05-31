package org.design.pattern.iterator.utils;

import org.design.pattern.iterator.bean.MenuItem;
import org.design.pattern.iterator.impl.BreakfastMenu;

public class Utils {

    public static void initMenuItem(BreakfastMenu menu) {
        addNewMenuItem(menu, new MenuItem("汉堡", 18.0));
        addNewMenuItem(menu, new MenuItem("鸡翅", 12.0));
        addNewMenuItem(menu, new MenuItem("肉包", 1.5));
        addNewMenuItem(menu, new MenuItem("粽子", 2.0));
    }
    
    private static void addNewMenuItem(BreakfastMenu menu, MenuItem menuItem) {
        menu.addNewMenuItem(menuItem);
    }
}
