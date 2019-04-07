package design.pattern.proxy.virtual2;

/**
 * @Description TODO
 * @Author Q-WHai
 * @Date 2019/4/7 18:05
 */
public class PrinterProxy implements Printable {

    private String name;
    private Printer real;

    public PrinterProxy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        if (null != real) {
            real.setName(name);
        }

        this.name = name;
    }

    @Override
    public void print(String content) {
        realize();
        real.print(content);
    }

    private synchronized void realize() {
        if (null == real) {
            real = new Printer(this.name);
        }
    }
}
