package design.pattern.factory.abstr.shape;

import org.apache.log4j.Logger;

public class RedSquarenessShape extends SquarenessShape {

    private final Logger logger = Logger.getLogger(RedSquarenessShape.class);

    @Override
    public void show() {
        logger.info("创建了一个红色的方形");
    }
}
