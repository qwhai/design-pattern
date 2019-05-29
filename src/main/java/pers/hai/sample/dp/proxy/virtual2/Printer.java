package pers.hai.sample.dp.proxy.virtual2;

import org.apache.log4j.Logger;

/**
 * TODO
 *
 * Create Time: 2019-04-07 18:05
 * Last Modify: 2019-05-24
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Printer implements Printable {

    private Logger logger = Logger.getLogger(Printer.class);
    private String name;

    public Printer(String name) {
        this.name = name;
        heavyJob();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void print(String content) {
        logger.info(String.format("打印机[%s]正在打印内容：%s", this.name, content));
    }

    private void heavyJob() {
        try {
            for (int i = 0; i < 5; i++) {
                logger.info(String.format("打印机[%s]正在初始化...", this.name));
                Thread.sleep(1000);
            }
            logger.info(String.format("打印机[%s]初始化完成", this.name));
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
