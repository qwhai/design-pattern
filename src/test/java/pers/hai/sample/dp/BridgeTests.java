package pers.hai.sample.dp;

import org.junit.Test;
import pers.hai.sample.dp.bridge.CountDisplay;
import pers.hai.sample.dp.bridge.Display;
import pers.hai.sample.dp.bridge.StringDisplayImpl;

/**
 * TODO
 * <p>
 * Create Time: 2019-05-29 18:04
 * Last Modify: 2019-05-29
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class BridgeTests {

    @Test
    public void test1() {
        Display d1 = new Display(new StringDisplayImpl("Hello, China"));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe"));

        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(10);
    }
}
