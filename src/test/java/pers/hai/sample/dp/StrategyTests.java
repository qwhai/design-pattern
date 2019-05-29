package pers.hai.sample.dp;

import org.junit.Test;
import pers.hai.sample.dp.strategy.*;

/**
 * TODO
 * <p>
 * Create Time: 2019-05-29 18:17
 * Last Modify: 2019-05-29
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class StrategyTests {

    @Test
    public void test1() {
        String[] args = new String[] {
                "123",
                "32"
        };

        int seed1 = Integer.parseInt(args[0]);
        int seed2 = Integer.parseInt(args[1]);

        Player player1 = new Player("Taro", new WinningStrategy(seed1));
        Player player2 = new Player("Hana", new ProbStrategy(seed2));

        for (int i = 0; i < 1000; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();

            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println(String.format("Winner: %s", player1));
                player1.win();
                player2.lose();
            } else if (nextHand2.isStrongerThan(nextHand1)) {
                System.out.println(String.format("Winner: %s", player2));
                player1.lose();
                player2.win();
            } else {
                System.out.println("Even...");
                player1.even();
                player2.even();
            }
        }

        System.out.println("Total result:");
        System.out.println(player1);
        System.out.println(player2);
    }
}
