package pers.hai.sample.dp;

import pers.hai.sample.dp.factory.method.framework.Factory;
import pers.hai.sample.dp.factory.method.framework.Product;
import pers.hai.sample.dp.factory.method.idcard.IDCardFactory;
import org.junit.Test;

import java.util.List;

public class FactoryMethodTest {

    @Test
    public void IDCardFactoryTest() {
        Factory factory = new IDCardFactory();

        Product p1 = factory.create("小明");
        p1.recharge(500);
        p1.use(100);

        Product p2 = factory.create("小红");
        p2.recharge(550);
        p2.use(300);

        List<String> owners = ((IDCardFactory) factory).getOwners();
        System.out.println(owners.size());
    }
}
