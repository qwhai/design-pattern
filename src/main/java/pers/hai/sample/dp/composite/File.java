package pers.hai.sample.dp.composite;

/**
 * TODO
 * <p>
 * Create Time: 2019-05-30 09:41
 * Last Modify: 2019-05-30
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class File extends Entry {

    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(String.format("%s/%s", prefix, this));
    }
}
