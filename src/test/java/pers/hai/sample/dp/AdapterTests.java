package pers.hai.sample.dp;

import org.junit.Test;

/**
 * TODO
 * <p>
 * Create Time: 2019-05-29 17:27
 * Last Modify: 2019-05-29
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class AdapterTests extends Testable {

    @Test
    public void test1() {
        pers.hai.sample.dp.adapter.inherit.Print p = new pers.hai.sample.dp.adapter.inherit.PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }

    @Test
    public void test2() {
        pers.hai.sample.dp.adapter.entrust.Print p = new pers.hai.sample.dp.adapter.entrust.PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
