package org.design.pattern.iterator.client;

import org.design.pattern.iterator.impl.BreakfastMenu;
import org.design.pattern.iterator.impl.LunchMenu;
import org.design.pattern.iterator.impl.Waitress;
import org.design.pattern.iterator.interf.Menu;
import org.design.pattern.iterator.utils.Utils;

public class IteratorClient {

    private Menu menu = null;
    private Waitress waitress = null;
    
    public static void main(String[] args) {
        IteratorClient client = new IteratorClient();
        client.initEvent();
        client.operate();
    }
    
    private void initEvent() {
        menu = new BreakfastMenu();
        Utils.initMenuItem((BreakfastMenu)menu);
        
        menu = new LunchMenu();
        
        waitress = new Waitress(menu);
    }
    
    private void operate() {
        waitress.printMenu();
    }
}
