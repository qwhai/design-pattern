package pers.hai.sample.dp.iterator;

/**
 * TODO
 * <p>
 * Create Time: 2019-05-29 16:40
 * Last Modify: 2019-05-29
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Book {

    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("《%s》", getName());
    }
}
