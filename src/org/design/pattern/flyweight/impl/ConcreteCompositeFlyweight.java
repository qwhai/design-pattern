package org.design.pattern.flyweight.impl;

import java.util.HashMap;
import java.util.Map;

import org.design.pattern.flyweight.interf.Flyweight;

/**
 * <p>
 * 复合的享元模式
 * </p>
 * Create Date: 2016年4月25日
 * Last Modify: 2016年4月25日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.0.1
 */
public class ConcreteCompositeFlyweight implements Flyweight {

    private Map<Integer, Flyweight> labels = new HashMap<Integer, Flyweight>();
    
    public void add(int key, Flyweight flyweight) {
        labels.put(key, flyweight);
    }
    
    @Override
    public void operation(String extrinsicState) {
        Flyweight flyweight = null;
        for (Object key : labels.keySet()) {
            flyweight = labels.get(key);
            flyweight.operation(extrinsicState);
        }
    }

}
