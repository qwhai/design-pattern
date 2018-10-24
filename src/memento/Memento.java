package memento;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    private int _money = 0;
    private List _fruits;

    public Memento(int money){
        this._money = money;
        this._fruits = new ArrayList();
    }

    public int getMoney(){
        return _money;
    }

    public void addFruit(String fruit){
        _fruits.add(fruit);
    }

    public List getFruits(){
        return _fruits;
    }
}
