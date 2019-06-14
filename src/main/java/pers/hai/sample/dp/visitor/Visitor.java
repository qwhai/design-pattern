package pers.hai.sample.dp.visitor;

import java.util.Collection;

/**
 * TODO
 * <p>
 * Create Time: 2019-06-14 11:17
 * Last Modify: 2019-06-14
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public interface Visitor {
    void visitString(StringElement stringE);
    void visitFloat(FloatElement floatE);
    void visitCollection(Collection collection);
}