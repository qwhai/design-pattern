package pers.hai.sample.dp.factory.abstr.shape;

import org.apache.log4j.Logger;

/**
 * Last Modify: 2019-05-24
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class RedCircularShape extends CircularShape {

    private final Logger logger = Logger.getLogger(RedCircularShape.class);

    @Override
    public void show() {
        logger.info("创建了一个红色的圆形");
    }
}
