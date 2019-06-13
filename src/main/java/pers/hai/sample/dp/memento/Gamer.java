package pers.hai.sample.dp.memento;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * TODO
 * <p>
 * Create Time: 2019-06-13 17:16
 * Last Modify: 2019-06-13
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Gamer {

    private final Logger logger = Logger.getLogger(Gamer.class);

    private int money;
    private List<String> fruits = new ArrayList<>();
    private Random random = new Random();

    private static String[] fruitNames = {
            " 苹果 ", " 香蕉 ", " 桔子 ", " 葡萄 "
    };

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return this.money;
    }

    public void bet() {
        int dict = random.nextInt(6) + 1;
        switch (dict) {
            case 1:
                money += 100;
                logger.info("所持金币增加了");
                break;
            case 2:
                money /= 2;
                logger.info("所持金币减半了");
                break;
            case 6:
                String fruit = getFruit();
                logger.info(String.format("获得了水果（%s）", fruit));
                fruits.add(fruit);
                break;
            default:
                logger.info("什么都没发生");
                break;
        }
    }

    public Memento createMemento() {
        Memento memento = new Memento(money);
        Iterator iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = (String) iterator.next();
            if (fruit.startsWith("好吃的"))
                memento.addFruit(fruit);
        }

        return memento;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.getMoney();
        this.fruits = memento.getFruits();
    }

    @Override
    public String toString() {
        return String.format("{money: %d, friuts: %s}", getMoney(), fruits);
    }

    private String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "好吃的";
        }

        return String.format("%s%s", prefix, fruitNames[random.nextInt(fruitNames.length)]);
    }
}
