package memento;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Gamer {
    private int _money = 0;
    private List _fruits = new ArrayList();
    private Random _random = new Random();
    private static String[] _fruitNames = { "苹果", "桔子", "香蕉", "梨子", "枣子" };

    public Gamer(int money){
        this._money = money;
    }

    public int getMoney(){
        return this._money;
    }

    public void bet(){
        int dice = _random.nextInt(6) + 1;
        if (1 == dice){
            _money += 100;
            System.out.println("所持金钱增加了");
        } else if (2 == dice){
            _money /= 2;
            System.out.println("所持金钱减半了");
        } else if (6 == dice){
            String fruit = getFruit();
            System.out.println("获得了水果: " + fruit);
            _fruits.add(fruit);
        } else {
            System.out.println("状态未改变，下一局");
        }
    }

    public Memento createMemento() {
        Memento m = new Memento(_money);
        Iterator it = _fruits.iterator();
        while (it.hasNext()){
            String s = (String) it.next();
            if (s.startsWith("好吃的")){
                m.addFruit(s);
            }
        }

        return m;
    }

    public void restoreMemento(Memento m){
        this._money = m.getMoney();
        this._fruits = m.getFruits();
    }

    @Override
    public String toString() {
        return "[money: " + _money + ", fruits: " + _fruits + "]";
    }

    private String getFruit(){
        String prefix = "";
        if (_random.nextBoolean()){
            prefix = "好吃的";
        }

        return prefix + _fruitNames[_random.nextInt(_fruitNames.length)];
    }
}
