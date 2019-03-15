package design.pattern.factory.abstr.shape;

import design.pattern.factory.abstr.framework.Shape;
import org.apache.log4j.Logger;

public class SquarenessShape implements Shape {

    private final Logger logger = Logger.getLogger(SquarenessShape.class);

    @Override
    public void show() {
        logger.info("创建了一个方形");
    }
}
