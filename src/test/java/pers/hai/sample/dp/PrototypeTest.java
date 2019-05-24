package pers.hai.sample.dp;

import pers.hai.sample.dp.prototype.Manager;
import pers.hai.sample.dp.prototype.MessageBox;
import pers.hai.sample.dp.prototype.Product;
import pers.hai.sample.dp.prototype.UnderlinePen;
import org.junit.Test;

/**
 * TODO
 * <p>
 * Create Time: 2019-05-21 21:51
 * Last Modify: 2019-05-24
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class PrototypeTest {

    @Test
    public void test1() {
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        Product p1 = manager.create("strong message");
        p1.use("Hello, world.");

        Product p2 = manager.create("warning box");
        p2.use("Hello, world.");

        Product p3 = manager.create("slash box");
        p3.use("Hello, world.");
    }
}
