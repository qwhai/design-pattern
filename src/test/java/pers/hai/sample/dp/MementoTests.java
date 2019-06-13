package pers.hai.sample.dp;

import org.junit.Test;
import pers.hai.sample.dp.memento.Gamer;
import pers.hai.sample.dp.memento.Memento;

/**
 * TODO
 * <p>
 * Create Time: 2019-06-13 17:09
 * Last Modify: 2019-06-13
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class MementoTests extends Testable {

    @Test
    public void test1() {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            logger.info(String.format("--------> ROUND %d", i + 1));
            logger.info(String.format("当前状态：%s", gamer));

            gamer.bet();

            logger.info(String.format("所持金币数：%d", gamer.getMoney()));
            if (gamer.getMoney() > memento.getMoney()) {
                logger.info("所持金币增加过多，保存游戏当前状态");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                logger.info("所持金币减少过多，恢复到之前保存的状态");
                gamer.restoreMemento(memento);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                logger.error(ex.getMessage());
            }

            System.out.println();
        }
    }
}
