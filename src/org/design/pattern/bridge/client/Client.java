package org.design.pattern.bridge.client;

import org.design.pattern.bridge.impl.MilkAddtion;
import org.design.pattern.bridge.impl.SuperSizeCoffee;
import org.design.pattern.bridge.interf.Addable;
import org.design.pattern.bridge.interf.Coffee;

/**
 * Create Date: 2016年3月17日
 * Last Modify: 2016年3月31日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1.1
 */
public class Client {

    public static void main(String[] args) {
        Addable addable = new MilkAddtion();
        Coffee coffee = new SuperSizeCoffee(addable);
        coffee.brewing();
        
        coffee.showCapacity();
        coffee.showAddable();
    }
}
