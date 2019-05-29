package pers.hai.sample.dp.proxy.virtual1;

import java.util.HashMap;
import java.util.Map;

/**
 * 可售票的
 *
 * Create Time: 2019-04-05 22:54
 * Last Modify: 2019-05-24
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public interface ITicketable {

    Map<String, Double> ticketMap = new HashMap<String, Double>() {
        {
            put("nanjing|shanghaihongqiao", 139.5);
            put("nanjingnan|shanghaihongqiao", 144.5);
            put("wuhan|changshanan", 164.5);
        }
    };

    double ticketPrice(String start, String end);
    void booking(String start, String end);
}
