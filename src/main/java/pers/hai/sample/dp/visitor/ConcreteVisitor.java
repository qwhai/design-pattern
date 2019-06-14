package pers.hai.sample.dp.visitor;

import java.util.Collection;
import java.util.Iterator;

/**
 * TODO
 * <p>
 * Create Time: 2019-06-14 11:21
 * Last Modify: 2019-06-14
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class ConcreteVisitor implements Visitor {
    //在本方法中,我们实现了对 Collection 的元素的成功访问
    public void visitCollection(Collection collection) {
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            if (o instanceof Visitable)
                ((Visitable) o).accept(this);
        }
    }

    public void visitString(StringElement stringE) {
        System.out.println("'"+stringE.getValue()+"'");
    }

    public void visitFloat(FloatElement floatE) {
        System.out.println(floatE.getValue().toString()+"f");
    }
}
