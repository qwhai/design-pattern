package pers.hai.sample.dp;

import org.junit.Test;
import pers.hai.sample.dp.cor.*;

/**
 * TODO
 * <p>
 * Create Time: 2019-06-14 14:46
 * Last Modify: 2019-06-14
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class ChainTests extends Testable {

    @Test
    public void test1() {
        Support alice = new NoSupport("Alice");
        Support bob = new LimitSupport("Bob", 100);
        Support charlie = new SpecialSupport("Charlie", 429);
        Support diana = new LimitSupport("Diana", 200);
        Support elmo = new OddSupport("Elmo");
        Support fred = new LimitSupport("Fred", 300);

        alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);

        for (int i = 0; i < 500; i+=33) {
            alice.support(new Trouble(i));
        }
    }
}
