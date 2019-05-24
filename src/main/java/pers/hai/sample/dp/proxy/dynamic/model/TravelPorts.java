package pers.hai.sample.dp.proxy.dynamic.model;

/**
 * TODO
 *
 * Create Time: 2019-04-10 15:14
 * Last Modify: 2019-05-24
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
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
