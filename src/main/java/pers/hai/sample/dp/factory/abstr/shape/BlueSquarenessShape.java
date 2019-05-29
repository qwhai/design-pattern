package pers.hai.sample.dp.factory.abstr.shape;

import org.apache.log4j.Logger;

/**
 * Last Modify: 2019-05-24
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class BlueSquarenessShape extends SquarenessShape {

    private final Logger logger = Logger.getLogger(BlueCircularShape.class);

    @Override
    public void show() {
        logger.info("创建了一个蓝色的方形");
    }
}
