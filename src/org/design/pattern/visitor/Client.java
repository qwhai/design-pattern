package org.design.pattern.visitor;

import java.util.ArrayList;
import java.util.Collection;

/**
 * <p></p>
 * Create Date: 2016年6月13日
 * Last Modify: 2016年6月13日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.0.1
 */
public class Client {

    public static void main(String[] args) {
        Visitor visitor = new ConcreteVisitor();
        StringElement stringE = new StringElement("I am a String");
        visitor.visitString(stringE);
        
        Collection<Visitable> list = new ArrayList<Visitable>();
        list.add(new StringElement("I am a String1"));
        list.add(new StringElement("I am a String2"));
        list.add(new FloatElement(new Float(12)));
        list.add(new StringElement("I am a String3"));
        visitor.visitCollection(list);
    }
}
