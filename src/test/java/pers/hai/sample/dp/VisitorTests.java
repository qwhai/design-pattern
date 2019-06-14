package pers.hai.sample.dp;

import org.junit.Test;
import pers.hai.sample.dp.visitor.ConcreteVisitor;
import pers.hai.sample.dp.visitor.FloatElement;
import pers.hai.sample.dp.visitor.StringElement;
import pers.hai.sample.dp.visitor.Visitor;

import java.util.ArrayList;
import java.util.Collection;

/**
 * TODO
 * <p>
 * Create Time: 2019-06-13 18:40
 * Last Modify: 2019-06-13
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class VisitorTests extends Testable {

    @Test
    public void test1() {
        Visitor visitor = new ConcreteVisitor();
        StringElement stringE = new StringElement("I am a String");
        visitor.visitString(stringE);
        Collection list = new ArrayList();
        list.add(new StringElement("I am a String1"));
        list.add(new StringElement("I am a String2"));
        list.add(new FloatElement(new Float(12)));
        list.add(new StringElement("I am a String3"));
        visitor.visitCollection(list);
    }

}
