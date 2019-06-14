package pers.hai.sample.dp.cor;

/**
 * TODO
 * <p>
 * Create Time: 2019-06-14 17:07
 * Last Modify: 2019-06-14
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Trouble {

    private int number;

    public Trouble(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    @Override
    public String toString() {
        return String.format("[Trouble %d]", this.number);
    }
}
