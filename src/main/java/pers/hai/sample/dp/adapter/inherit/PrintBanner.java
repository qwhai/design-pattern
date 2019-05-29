package pers.hai.sample.dp.adapter.inherit;

/**
 * TODO
 * <p>
 * Create Time: 2019-05-29 17:25
 * Last Modify: 2019-05-29
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String name) {
        super(name);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
