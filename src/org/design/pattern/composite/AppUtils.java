package org.design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class AppUtils {

    public void showVegetarMenu(MenuComponent menu) {
        List<MenuComponent> visited = new ArrayList<>();
        showVegetarMenu(menu, visited);
    }
    
    private void showVegetarMenu(MenuComponent menu, List<MenuComponent> visited) {
        if (visited.contains(menu)) {
            return;
        }
        
        if (menu instanceof MenuItem) {
            if (menu.isVegetarian()) {
                System.out.println(menu);
            }
            return;
        }
        
        List<MenuComponent> children = ((Menu) menu).getChildren();
        for (int i = 0; i < children.size(); i++) {
            showVegetarMenu(children.get(i), visited);
        }
    }
}
