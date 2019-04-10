package design.pattern.proxy.dynamic;

import design.pattern.proxy.dynamic.model.StationPort;
import design.pattern.proxy.dynamic.model.TravelPorts;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Author: Q-WHai
 * @Date: Created in 10:50 2019/04/10
 */
public interface ITicketable {

    Map<TravelPorts, Double> ticketMap = new HashMap<>() {
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
