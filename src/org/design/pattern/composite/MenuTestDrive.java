package org.design.pattern.composite;

public class MenuTestDrive {

    public static void main(String[] args) {
        MenuComponent rootMenu = new Menu("Root", "root");
        
        MenuComponent breakfastMenu = new Menu("早餐", "breakfast");
        MenuComponent bunMenuItem = new MenuItem("包子", "bun", true, 1.5);
        MenuComponent frittersMenuItem = new MenuItem("油条", "fritters", true, 1.2);
        MenuComponent milkMenuItem = new MenuItem("豆浆", "milk", true, 2.0);
        breakfastMenu.add(bunMenuItem);
        breakfastMenu.add(frittersMenuItem);
        breakfastMenu.add(milkMenuItem);
        
        MenuComponent lunchMenu = new Menu("午餐", "lunch");
        MenuComponent southMenu = new Menu("南方菜", "south");
        MenuComponent potMeatMenuItem = new MenuItem("锅包肉", "Pot package of meat", false, 20.0);
        MenuComponent porkNoodleMenuItem = new MenuItem("猪肉炖粉条", "Pork stew noodles", false, 18.0);
        MenuComponent spicyChickenMenuItem = new MenuItem("辣子鸡", "Spicy Chicken", false, 22.0);
        southMenu.add(potMeatMenuItem);
        southMenu.add(porkNoodleMenuItem);
        southMenu.add(spicyChickenMenuItem);
        MenuComponent northMenu = new Menu("北方菜", "north");
        MenuComponent friedNoodlesMenuItem = new MenuItem("炒米粉", "Fried noodles", true, 8.0);
        MenuComponent lambMenuItem = new MenuItem("南焖羊肉", "South lamb stew", false, 14.0);
        MenuComponent spareribsMenuItem = new MenuItem("蒸排骨", "Steamed pork ribs", false, 15.0);
        northMenu.add(friedNoodlesMenuItem);
        northMenu.add(lambMenuItem);
        northMenu.add(spareribsMenuItem);
        lunchMenu.add(southMenu);
        lunchMenu.add(northMenu);
        
        MenuComponent dinnerMenu = new Menu("晚餐", "dinner");
        MenuComponent snackMenu = new Menu("地道小吃", "snack");
        MenuComponent hamburgerMenuItem = new MenuItem("肉夹馍", "Hamburger", false, 7.0);
        MenuComponent steamedMenuItem = new MenuItem("羊肉泡馍", "Steamed mutton", false, 22.0);
        snackMenu.add(hamburgerMenuItem);
        snackMenu.add(steamedMenuItem);
        MenuComponent dessertMenu = new Menu("甜点", "dessert");
        MenuComponent iceCreamMenuItem = new MenuItem("冰淇淋", "ice cream", true, 5.0);
        dessertMenu.add(iceCreamMenuItem);
        dinnerMenu.add(snackMenu);
        dinnerMenu.add(dessertMenu);
        
        rootMenu.add(breakfastMenu);
        rootMenu.add(lunchMenu);
        rootMenu.add(dinnerMenu);
        
        Waitress waitress = new Waitress(rootMenu);
//        waitress.printMenu();
//        waitress.showVegetarMenu();
        waitress.printVegetarMenu();
    }
}
