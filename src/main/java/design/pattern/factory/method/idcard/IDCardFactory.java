package design.pattern.factory.method.idcard;

import design.pattern.factory.method.framework.Factory;
import design.pattern.factory.method.framework.Product;

import java.util.ArrayList;
import java.util.List;

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
