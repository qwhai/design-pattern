package org.design.pattern.composite;

import java.util.Iterator;

/**
 * <p>
 * 菜单项（即每一种菜）
 * </p>
 * Create Date: 2016年5月17日
 * Last Modify: 2016年5月17日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.0.3
 */
public class MenuItem extends MenuComponent {

    private String name = null;
    private String desc = null;
    private boolean vegetarian = false;
    private double price = 0.0d;
    
    public MenuItem(String _name, String _desc, boolean _vegetarian, double _price) {
        this.name = _name;
        this.desc = _desc;
        this.vegetarian = _vegetarian;
        this.price = _price;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return desc;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        return new NullIterator();
    }
    
    @Override
    public String toString() {
        return "MenuItem: { " + name + ", " + desc + ", " + vegetarian + ", " + price + " }";
    }
}
