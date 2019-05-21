package design.pattern.prototype;

/**
 * TODO
 * <p>
 * Create Time: 2019/5/21 21:41
 * Last Modify: 2019/5/21
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public interface Product extends Cloneable {
    void use(String s);
    Product createClone();
}
