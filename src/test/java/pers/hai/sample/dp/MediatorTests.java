package pers.hai.sample.dp;

import org.junit.Test;
import pers.hai.sample.dp.mediator.HouseOwner;
import pers.hai.sample.dp.mediator.MediatorStructure;
import pers.hai.sample.dp.mediator.Tenant;

/**
 * TODO
 * <p>
 * Create Time: 2019-06-14 14:01
 * Last Modify: 2019-06-14
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class MediatorTests extends Testable {

    @Test
    public void test1() {
        MediatorStructure mediator = new MediatorStructure();

        HouseOwner houseOwner = new HouseOwner("张三", mediator);
        Tenant tenant = new Tenant("李四", mediator);

        //中介结构要知道房主和租房者
        mediator.setHouseOwner(houseOwner);
        mediator.setTenant(tenant);

        tenant.constact("听说你那里有三室的房主出租.....");
        houseOwner.constact("是的!请问你需要租吗?");
    }
}
