package design.pattern.factory.abstr.shape;

import org.apache.log4j.Logger;

public class RedCircularShape extends CircularShape {

    private final Logger logger = Logger.getLogger(RedCircularShape.class);

    @Override
    public void show() {
        logger.info("创建了一个红色的圆形");
    }
}
