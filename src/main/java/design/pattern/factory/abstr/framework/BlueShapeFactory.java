package design.pattern.factory.abstr.framework;

import design.pattern.factory.abstr.shape.BlueCircularShape;
import design.pattern.factory.abstr.shape.BlueSquarenessShape;

public class BlueShapeFactory implements ShapeFactory {

    @Override
    public Shape createSquareness() {
        return new BlueSquarenessShape();
    }

    @Override
    public Shape createCircular() {
        return new BlueCircularShape();
    }
}
