package pers.hai.sample.dp.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 * <p>
 * Create Time: 2019-06-03 18:04
 * Last Modify: 2019-06-03
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class ShapeFactory {

    private Map<String, Circular> cirMap = new HashMap<>();
    private Map<String, Rectangle> rectMap = new HashMap<>();
    public static ShapeFactory instance;

    private ShapeFactory() { }

    public static ShapeFactory getInstance() {
        if (null == instance)
            instance = new ShapeFactory();

        return instance;
    }

    public Circular createCirculer(String state) {
        if (!cirMap.containsKey(state))
            cirMap.put(state, new Circular(state));
        return cirMap.get(state);
    }

    public Rectangle createRectangle(String state) {
        if (!rectMap.containsKey(state))
            rectMap.put(state, new Rectangle(state));
        return rectMap.get(state);
    }
}
