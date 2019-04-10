package design.pattern.proxy.dynamic.model;

/**
 * @Description TODO
 * @Author: Q-WHai
 * @Date: Created in 15:14 2019/04/10
 */
public class TravelPorts {
    private StationPort from;
    private StationPort to;

    public TravelPorts(String from, String to) {
        this.from = new StationPort(from);
        this.to = new StationPort(to);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof TravelPorts)) return false;
        return hashCode() == obj.hashCode();
    }

    @Override
    public int hashCode() {
        return String.format("%s|%s", from.getName(), to.getName()).hashCode();
    }

    @Override
    public String toString() {
        return String.format("[%s->%s]", from.getName(), to.getName());
    }
}
