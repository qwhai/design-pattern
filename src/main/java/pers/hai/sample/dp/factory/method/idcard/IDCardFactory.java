package pers.hai.sample.dp.factory.method.idcard;

import pers.hai.sample.dp.factory.method.framework.Factory;
import pers.hai.sample.dp.factory.method.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Last Modify: 2019-05-24
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class IDCardFactory extends Factory {

    private List<String> owners = new ArrayList<>();

    @Override
    public Product createProduct(String name) {
        return new IDCard(name);
    }

    @Override
    public void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }
}
