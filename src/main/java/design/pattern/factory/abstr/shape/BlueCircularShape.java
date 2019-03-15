package design.pattern.factory.abstr.shape;

import org.apache.log4j.Logger;

public class BlueCircularShape extends CircularShape {

    private final Logger logger = Logger.getLogger(BlueCircularShape.class);

    @Override
    public void show() {
        logger.info("创建了一个蓝色的圆形");
    }
}
