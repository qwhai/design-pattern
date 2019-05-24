package pers.hai.sample.dp.proxy.virtual2;

/**
 * TODO
 *
 * Create Time: 2019-04-07 18:05
 * Last Modify: 2019-05-24
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
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
