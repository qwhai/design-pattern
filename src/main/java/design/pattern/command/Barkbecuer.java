package design.pattern.command;

import org.apache.log4j.Logger;

/**
 * @Author: Q-WHai
 * @Date: Created in 10:46 2019/05/14
 */
public class Barkbecuer {

    private final Logger logger = Logger.getLogger(Barkbecuer.class);

    public void bakeMutton() {
        logger.info("烤羊肉串");
    }

    public void bakeChickenWing() {
        logger.info("烤鸡翅膀");
    }
}
