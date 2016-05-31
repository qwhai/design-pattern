package org.design.pattern.factory3.factorys;

import org.design.pattern.factory3.interf.Flyable;
import org.design.pattern.factory3.interf.Moveable;
import org.design.pattern.factory3.interf.Writeable;

/**
 * <p>
 * 抽象工具类
 * </p>
 * 2015年12月10日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1
 */
public abstract class AbstractFactory {

    public abstract Flyable createFlyable();
    
    public abstract Moveable createMoveable();
    
    public abstract Writeable createWriteable();
}
