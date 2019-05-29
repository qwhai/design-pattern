package pers.hai.sample.dp.strategy;

import java.util.Random;

/**
 * TODO
 * <p>
 * Create Time: 2019-05-29 18:26
 * Last Modify: 2019-05-29
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class WinningStrategy implements Strategy {

    private Random random;
    private boolean won = false;
    private Hand prevHand;

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won)
            prevHand = Hand.getHand(random.nextInt(3));

        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
