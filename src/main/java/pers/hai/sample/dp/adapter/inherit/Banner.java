package pers.hai.sample.dp.adapter.inherit;

import org.apache.log4j.Logger;

/**
 * TODO
 * <p>
 * Create Time: 2019-05-29 17:22
 * Last Modify: 2019-05-29
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Banner {

    private final Logger logger = Logger.getLogger(Banner.class);

    private String name;

    public Banner(String name) {
        this.name = name;
    }

    public void showWithParen() {
        logger.info(String.format("(%s)", name));
    }

    public void showWithAster() {
        logger.info(String.format("*%s*", name));
    }
}
