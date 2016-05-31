package org.design.pattern.iterator.bean;

/**
 * <p>
 * 菜单项
 * </p>
 * 2016年3月4日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1.1
 */
public class MenuItem {

    private String name = null;
    
    private double price = 0.0;
    
    public MenuItem(String _name, double _price) {
        this.name = _name;
        this.price = _price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "(" + name + ", " + price + ")";
    }
}
