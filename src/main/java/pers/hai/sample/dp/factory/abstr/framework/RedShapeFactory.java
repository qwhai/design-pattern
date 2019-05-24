package pers.hai.sample.dp.factory.abstr.framework;

import pers.hai.sample.dp.factory.abstr.shape.RedCircularShape;
import pers.hai.sample.dp.factory.abstr.shape.RedSquarenessShape;

/**
 * Last Modify: 2019-05-24
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
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
