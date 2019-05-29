package design.pattern.proxy.virtual1;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 可售票的
 * @Author Q-WHai
 * @Date 2019/4/5 22:54
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
