package pers.hai.sample.dp.flyweight;

import org.apache.log4j.Logger;

/**
 * TODO
 * <p>
 * Create Time: 2019-06-03 18:18
 * Last Modify: 2019-06-03
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Rectangle implements Shape {

    private final Logger logger = Logger.getLogger(Rectangle.class);

    private String color;
    private double x;
    private double y;
    private double width;
    private double height;

    public Rectangle(String color) {
        this.color = color;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void draw() {
        logger.info(String.format("Rectangle: color = %s, x = %s, y = %s, width = %s, height = %s", color, x, y , width, height));
    }
}
