package pers.hai.sample.dp.strategy;

/**
 * TODO
 * <p>
 * Create Time: 2019-05-29 18:25
 * Last Modify: 2019-05-29
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public interface Strategy {
    Hand nextHand();
    void study(boolean win);
}
