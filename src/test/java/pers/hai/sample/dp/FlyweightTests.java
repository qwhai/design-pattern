package pers.hai.sample.dp;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import pers.hai.sample.dp.flyweight.*;

/**
 * TODO
 * <p>
 * Create Time: 2019-06-03 15:12
 * Last Modify: 2019-06-03
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class FlyweightTests extends Testable {

    private final Logger logger = Logger.getLogger(FlyweightTests.class);

    @Test
    public void test1() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Circular cir1 = factory.createCirculer("red");
        cir1.setX(100);
        cir1.setY(100);
        cir1.setR(100);
        cir1.draw();

        Circular cir2 = factory.createCirculer("blue");
        cir2.setX(100);
        cir2.setY(300);
        cir2.setR(200);
        cir2.draw();

        Circular cir3 = factory.createCirculer("red");
        cir3.setX(20);
        cir3.setY(50);
        cir3.setR(300);
        cir3.draw();

        Assert.assertNotSame(cir1, cir2);
        Assert.assertNotSame(cir2, cir3);
        Assert.assertSame(cir1, cir3);
    }

    @Test
    public void test2() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Rectangle rect1 = factory.createRectangle("red");
        rect1.setX(12);
        rect1.setY(23);
        rect1.setWidth(13);
        rect1.setHeight(565);
        rect1.draw();

        Rectangle rect2 = factory.createRectangle("black");
        rect2.setX(122);
        rect2.setY(11);
        rect2.setWidth(13);
        rect2.setHeight(98);
        rect2.draw();

        Rectangle rect3 = factory.createRectangle("red");
        rect3.setX(212);
        rect3.setY(12);
        rect3.setWidth(66);
        rect3.setHeight(76);
        rect3.draw();

        Assert.assertNotSame(rect1, rect2);
        Assert.assertNotSame(rect2, rect3);
        Assert.assertSame(rect1, rect3);
    }
}
