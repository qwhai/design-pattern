package pers.hai.sample.dp.cor;

import org.apache.log4j.Logger;

/**
 * TODO
 * <p>
 * Create Time: 2019-06-14 17:09
 * Last Modify: 2019-06-14
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public abstract class Support {

    private final Logger logger = Logger.getLogger(Support.class);

    private String name;
    private Support next;

    Support(String name) {
        this.name = name;
    }

    public Support setNext(Support support) {
        this.next = support;
        return this.next;
    }

    public final void support(Trouble trouble) {
        if (resolve(trouble))
            done(trouble);
        else if (null != next)
            next.support(trouble);
        else
            fail(trouble);
    }

    @Override
    public String toString() {
        return String.format("[%s]", name);
    }

    protected abstract boolean resolve(Trouble trouble);

    private void done(Trouble trouble) {
        logger.info(String.format("%s is resolved by %s.", trouble, this));
    }

    private void fail(Trouble trouble) {
        logger.info(String.format("%s cannot be resolved.", trouble));
    }
}
