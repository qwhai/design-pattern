package design.pattern.proxy.virtual1;

import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 南京站
 * @Author Q-WHai
 * @Date 2019/4/5 22:23
 */
public class NanjingStation implements IStation {

    private Logger logger = Logger.getLogger(NanjingStation.class);

    private Map<String, Integer> _ticketSurplus = new HashMap<>() {
        {
            put("nanjing|shanghaihongqiao", 20);
            put("nanjingnan|shanghaihongqiao", 16);
            put("wuhan|changshanan", 7);
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
        logger.info(String.format("南京站正在出票，从 %s 到 %s", start, end));
        _ticketSurplus.replace(String.format("%s|%s", start, end), _ticketSurplus.get(String.format("%s|%s", start, end)) - 1);
    }
}
