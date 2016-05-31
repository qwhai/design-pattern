package org.design.pattern.flyweight.factory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.design.pattern.flyweight.impl.ConcreteCompositeFlyweight;
import org.design.pattern.flyweight.impl.ConcreteFlyweight;
import org.design.pattern.flyweight.interf.Flyweight;

/**
 * <p>
 * Flyweight factory负责维护一个Flyweight池(存放内部状态)
 * </p>
 * Create Date: 2016年4月25日 Last Modify: 2016年4月25日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/
 *      lemon_tree12138</a>
 * @version 0.0.2
 */
public class FlyweightFactory {

    private Map<Integer, Flyweight> labels = new HashMap<Integer, Flyweight>();

    /**
     * 单纯享元工厂
     */
    public Flyweight factory(String intrinsicState) {
        
        int hashCode = intrinsicState.hashCode();
        
        Flyweight fly = labels.get(hashCode);
        
        if (fly == null) {
            fly = new ConcreteFlyweight(intrinsicState);
            labels.put(hashCode, fly);
        }
        
        return fly;
    }
    
    /**
     * 复合享元工厂
     */
    public Flyweight compositeFactory(List<String> intrinsicStates) {
        ConcreteCompositeFlyweight flyweight = new ConcreteCompositeFlyweight();
        
        for (String intrinsicState : intrinsicStates) {
            flyweight.add(intrinsicState.hashCode(), factory(intrinsicState));
        }
        
        return flyweight;
    }
}