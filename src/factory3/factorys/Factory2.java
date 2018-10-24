package factory3.factorys;

import factory3.interf.Flyable;
import factory3.interf.Moveable;
import factory3.interf.Writeable;
import factory3.prod.Bus;
import factory3.prod.Fighter;
import factory3.prod.Pencil;

/**
 * <p>
 * 第二个工厂生产：战斗机、公交车和铅笔
 * </p>
 * 2015年12月10日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1
 */
public class Factory2 extends AbstractFactory {

    @Override
    public Flyable createFlyable() {
        return new Fighter();
    }

    @Override
    public Moveable createMoveable() {
        return new Bus();
    }

    @Override
    public Writeable createWriteable() {
        return new Pencil();
    }

}
