package pers.hai.sample.dp.flyweight;

import org.apache.log4j.Logger;

/**
 * TODO
 * <p>
 * Create Time: 2019-06-03 18:04
 * Last Modify: 2019-06-03
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Circular implements Shape {

    private final Logger logger = Logger.getLogger(Circular.class);

    private String color;
    private double x;
    private double y;
    private double r;

    public Circular(String color) {
        this.color = color;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public void draw() {
        logger.info(String.format("Circular: color = %s, x = %s, y = %s, r = %s", color, x, y , r));
    }
}
