package pers.hai.sample.dp.factory.method.framework;

/**
 * Last Modify: 2019-05-24
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public abstract class Factory {

    public Product create(String name) {
        Product product = createProduct(name);
        registerProduct(product);

        return product;
    }

    protected abstract Product createProduct(String name);

    protected abstract void registerProduct(Product product);
}
