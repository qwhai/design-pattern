package pers.hai.sample.dp.proxy.dynamic;

import pers.hai.sample.dp.proxy.dynamic.model.StationPort;
import pers.hai.sample.dp.proxy.dynamic.model.TravelPorts;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * Create Time: 2019-04-10 10:50
 * Last Modify: 2019-05-24
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public interface ITicketable {

    Map<TravelPorts, Double> ticketMap = new HashMap<TravelPorts, Double>() {
        {
            put(new TravelPorts("南京", "上海虹桥"), 139.5);
            put(new TravelPorts("南京南", "上海虹桥"), 144.5);
            put(new TravelPorts("武汉", "长沙"), 164.5);
        }
    };

    // 票价查询
    double ticketPrice(StationPort from, StationPort to);

    // 订票
    boolean booking(StationPort from, StationPort to);
}
