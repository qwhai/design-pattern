package pers.hai.sample.dp.visitor;

/**
 * TODO
 * <p>
 * Create Time: 2019-06-14 11:15
 * Last Modify: 2019-06-14
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public interface Visitable {
    void accept(Visitor visitor);
}
