package pers.hai.sample.dp.factory.abstr.framework;

import pers.hai.sample.dp.factory.abstr.shape.BlueCircularShape;
import pers.hai.sample.dp.factory.abstr.shape.BlueSquarenessShape;

/**
 * TODO
 *
 * Last Modify: 2019-05-24
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
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
