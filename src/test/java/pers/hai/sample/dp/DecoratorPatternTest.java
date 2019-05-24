package pers.hai.sample.dp;

import org.junit.Test;
import pers.hai.sample.dp.decorator.*;

/**
 * TODO
 *
 * Create Time: 2019-04-10 17:51
 * Last Modify: 2019-05-24
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class DecoratorPatternTest {

    @Test
    public void test1() {
        Display display = new StringDisplay("Hello world.");
        display.show();
    }

    @Test
    public void test2() {
        Display d1 = new StringDisplay("Hello world.");

        Border b1 = new SideBorder(d1);
        b1.show();

        Border b2 = new SideBorder(d1, '#');
        b2.show();

        Border b3 = new SideBorder(d1, '[', ']');
        b3.show();
    }

    @Test
    public void test3() {
        Display d1 = new StringDisplay("Hello world.");

        Border b1 = new SideBorder(d1, '#');
        Border b2 = new FullBorder(b1);
        b2.show();
    }

    @Test
    public void test4() {
        Display d1 = new StringDisplay("Hello world.");

        Border b1 = new SideBorder(d1);
        Border b2 = new FullBorder(b1);
        Border b3 = new SideBorder(b2, '#');
        Border b4 = new FullBorder(b3);
        b4.show();
    }
}
