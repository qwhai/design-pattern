package org.design.pattern.visitor;

import java.util.Collection;
import java.util.Iterator;

/**
 * <p></p>
 * Create Date: 2016年6月13日
 * Last Modify: 2016年6月13日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.0.1
 */
class ConcreteVisitor implements Visitor {

    // 在本方法中,我们实现了对 Collection 的元素的成功访问
    public void visitCollection(Collection<Visitable> collection) {
        Iterator<Visitable> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            if (o instanceof Visitable)
                ((Visitable) o).accept(this);
        }
    }

    public void visitString(StringElement stringE) {
        System.out.println("'" + stringE.getValue() + "'");
    }

    public void visitFloat(FloatElement floatE) {
        System.out.println(floatE.getValue().toString() + "f");
    }
}