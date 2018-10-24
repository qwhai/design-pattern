package org.design.pattern.visitor_no;

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
        Collection<Element> elements = new ArrayList<Element>();
        elements.add(new StringElement("Label__01"));
        elements.add(new FloatElement(1.2f));
        elements.add(new StringElement("Label__02"));
        
        for (Element element : elements) {
            if (element instanceof StringElement) {
                System.out.println(((StringElement)element).getValue());
            } else if (element instanceof FloatElement) {
                System.out.println(((FloatElement)element).getValue());
            }
        }
    }
}
