package pers.hai.sample.dp.proxy.virtual1;

import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

/**
 * 南京南站
 *
 * Create Time: 2019-04-05 22:27
 * Last Modify: 2019-05-24
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class NanjingnanStation implements IStation {

    private Logger logger = Logger.getLogger(NanjingnanStation.class);

    private Map<String, Integer> _ticketSurplus = new HashMap<String, Integer>() {
        {
            put("nanjing|shanghaihongqiao", 10);
            put("nanjingnan|shanghaihongqiao", 60);
            put("wuhan|changshanan", 23);
        }
    };

    @Override
    public double ticketPrice(String start, String end) {
        return ticketMap.get(String.format("%s|%s", start, end));
    }

    @Override
    public int ticketSurplus(String start, String end) {
        return _ticketSurplus.get(String.format("%s|%s", start, end));
    }

    @Override
    public void booking(String start, String end) {
        logger.info(String.format("南京南站正在出票，从 %s 到 %s", start, end));
        _ticketSurplus.replace(String.format("%s|%s", start, end), _ticketSurplus.get(String.format("%s|%s", start, end)) - 1);
    }
}
