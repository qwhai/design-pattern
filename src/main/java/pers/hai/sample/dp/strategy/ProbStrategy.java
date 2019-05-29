package pers.hai.sample.dp.strategy;

import java.util.Random;

/**
 * TODO
 * <p>
 * Create Time: 2019-05-29 18:27
 * Last Modify: 2019-05-29
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class ProbStrategy implements Strategy {
    private Random random;
    private int prevHandValue = 0;
    private int currentHandValue = 0;

    private int[][] history = {
            { 1, 1, 1 },
            { 1, 1, 1 },
            { 1, 1, 1 }
    };

    public ProbStrategy(int seed) {
        random = new Random(seed);
    }

    public Hand nextHand() {
        int bet = random.nextInt(getSum(currentHandValue));
        int handval = 0;
        if (bet < history[currentHandValue][0])
            handval = 0;
        else if (bet < history[currentHandValue][0] + history[currentHandValue][1])
            handval = 1;
        else
            handval = 2;

        prevHandValue = currentHandValue;
        currentHandValue = handval;
        return Hand.getHand(handval);
    }

    private int getSum(int hv) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += history[hv][i];
        }

        return sum;
    }

    public void study(boolean win) {
        if (win)
            history[prevHandValue][currentHandValue]++;
        else {
            history[prevHandValue][(currentHandValue + 1) % 3]++;
            history[prevHandValue][(currentHandValue + 2) % 3]++;
        }
    }
}
