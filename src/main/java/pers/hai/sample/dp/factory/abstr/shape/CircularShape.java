package pers.hai.sample.dp.factory.abstr.shape;

import pers.hai.sample.dp.factory.abstr.framework.Shape;
import org.apache.log4j.Logger;

/**
 * Last Modify: 2019-05-24
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class CircularShape implements Shape {

    private final Logger logger = Logger.getLogger(CircularShape.class);

    @Override
    public void show() {
        logger.info("创建了一个圆形");
    }
}
