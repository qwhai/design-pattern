package design.pattern.decorator;

import org.junit.Test;

/**
 * @Description TODO
 * @Author: Q-WHai
 * @Date: Created in 17:51 2019/04/10
 */
public class DecoratorTest {

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
