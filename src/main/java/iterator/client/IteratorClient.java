package iterator.client;

import iterator.impl.BreakfastMenu;
import iterator.impl.LunchMenu;
import iterator.impl.Waitress;
import iterator.interf.Menu;
import iterator.utils.Utils;

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
