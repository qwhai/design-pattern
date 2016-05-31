package org.design.pattern.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <p>
 * 菜单
 * </p>
 * Create Date: 2016年5月17日
 * Last Modify: 2016年5月17日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.0.3
 */
public class Menu extends MenuComponent {

    private String name = null;
    private String desc = null;
    private List<MenuComponent> menuComponents = null;
    
    private CompositeIterator iterator = null;
    
    public Menu(String _name, String _desc) {
        name = _name;
        desc = _desc;
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
    public void print() {
        System.out.println("\nMenu: { " + name + ", " + desc + " }");
        if (menuComponents == null) {
            return;
        }
        System.out.println("-------------------------");
        
        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }
    
    @Override
    public String toString() {
        return "Menu: { " + name + ", " + desc + " }";
    }

    @Override
    public void add(MenuComponent menuComponent) {
        if (menuComponents == null) {
            menuComponents = new ArrayList<MenuComponent>();
        }
        menuComponents.add(menuComponent);
    }

    @Override
    public MenuComponent getChild(int childIndex) {
        if (menuComponents == null || menuComponents.size() <= childIndex) {
            return null;
        }
        return menuComponents.get(childIndex);
    }
    
    public List<MenuComponent> getChildren() {
        return menuComponents;
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        if (iterator == null) {
            iterator = new CompositeIterator(menuComponents.iterator());
        }
        
        return iterator;
    }
}
