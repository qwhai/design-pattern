package design.pattern.factory.abstr.framework;

import design.pattern.factory.abstr.shape.RedCircularShape;
import design.pattern.factory.abstr.shape.RedSquarenessShape;

public class RedShapeFactory implements ShapeFactory {

    @Override
    public Shape createCircular() {
        return new RedCircularShape();
    }

    @Override
    public Shape createSquareness() {
        return new RedSquarenessShape();
    }
}
