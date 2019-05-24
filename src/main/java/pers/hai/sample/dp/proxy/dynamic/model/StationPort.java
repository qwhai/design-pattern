package pers.hai.sample.dp.proxy.dynamic.model;

/**
 * TODO
 *
 * Create Time: 2019-04-10 14:27
 * Last Modify: 2019-05-24
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class StationPort {
    private String name;

    public StationPort(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof StationPort)) return false;
        return hashCode() == obj.hashCode();
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    @Override
    public String toString() {
        return String.format("[%s]", getName());
    }
}
