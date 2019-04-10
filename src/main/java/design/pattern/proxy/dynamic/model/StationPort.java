package design.pattern.proxy.dynamic.model;

/**
 * @Description TODO
 * @Author: Q-WHai
 * @Date: Created in 14:27 2019/04/10
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
