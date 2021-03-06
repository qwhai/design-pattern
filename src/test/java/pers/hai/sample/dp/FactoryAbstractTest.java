package pers.hai.sample.dp;

import pers.hai.sample.dp.factory.abstr.framework.BlueShapeFactory;
import pers.hai.sample.dp.factory.abstr.framework.RedShapeFactory;
import pers.hai.sample.dp.factory.abstr.framework.Shape;
import pers.hai.sample.dp.factory.abstr.framework.ShapeFactory;
import org.junit.Test;

public class FactoryAbstractTest {

    @Test
    public void test1() {
        ShapeFactory factory1 = new BlueShapeFactory();
        {
            Shape shape1 = factory1.createCircular();
            shape1.show();

            Shape shape2 = factory1.createSquareness();
            shape2.show();
        }

        ShapeFactory factory2 = new RedShapeFactory();
        {
            Shape shape1 = factory2.createCircular();
            shape1.show();

            Shape shape2 = factory2.createSquareness();
            shape2.show();
        }
    }
}
