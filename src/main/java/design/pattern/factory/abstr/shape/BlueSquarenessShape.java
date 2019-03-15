package design.pattern.factory.abstr.shape;

import org.apache.log4j.Logger;

public class BlueSquarenessShape extends SquarenessShape {

    private final Logger logger = Logger.getLogger(BlueCircularShape.class);

    @Override
    public void show() {
        logger.info("创建了一个蓝色的方形");
    }
}
