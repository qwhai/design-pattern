package design.pattern.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 * <p>
 * Create Time: 2019/5/21 21:42
 * Last Modify: 2019/5/21
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Manager {

    private Map<String, Product> showcase = new HashMap<>();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoName) {
        Product p = (Product) showcase.get(protoName);
        return p.createClone();
    }
}
