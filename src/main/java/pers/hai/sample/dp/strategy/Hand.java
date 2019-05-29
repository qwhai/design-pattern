package pers.hai.sample.dp.strategy;

/**
 * TODO
 * <p>
 * Create Time: 2019-05-29 18:18
 * Last Modify: 2019-05-29
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Hand {

    public static final int HANDVALUE_GUU = 0;  // 表示石头的值
    public static final int HANDVALUE_CHO = 1;  // 表示剪刀的值
    public static final int HANDVALUE_PAA = 2;  // 表示布的值

    public static final Hand[] hands = {
            new Hand(Hand.HANDVALUE_GUU),
            new Hand(Hand.HANDVALUE_CHO),
            new Hand(Hand.HANDVALUE_PAA)
    };

    private static final String[] names = {
            " 石头 ", " 剪刀 ", "布"
    };

    private int handval;
    public Hand(int handval) {
        this.handval = handval;
    }

    public static Hand getHand(int handval) {
        return hands[handval];
    }

    public boolean isStrongerThan(Hand h) {
        return 1 == fight(h);
    }

    public boolean isWeakerThan(Hand h) {
        return -1 == fight(h);
    }

    private int fight(Hand h) {
        return this == h ? 0 : ((this.handval + 1) % 3 == h.handval) ? 1 : -1;
    }

    @Override
    public String toString() {
        return names[handval];
    }
}
