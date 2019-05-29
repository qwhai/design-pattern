package pers.hai.sample.dp.adapter.entrust;

import pers.hai.sample.dp.adapter.inherit.Banner;

/**
 * TODO
 * <p>
 * Create Time: 2019-05-29 17:34
 * Last Modify: 2019-05-29
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class PrintBanner extends Print {

    private Banner banner;

    public PrintBanner(String name) {
        banner = new Banner(name);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
