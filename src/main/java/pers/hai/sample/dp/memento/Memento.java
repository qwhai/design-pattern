package pers.hai.sample.dp.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 * <p>
 * Create Time: 2019-06-13 17:10
 * Last Modify: 2019-06-13
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Memento {

    private int money;
    private List<String> fruits;

    public int getMoney() {
        return this.money;
    }

    public Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }

    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    List<String> getFruits() {
        return fruits;
    }
}
