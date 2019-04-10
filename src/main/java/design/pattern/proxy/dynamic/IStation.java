package design.pattern.proxy.dynamic;

import design.pattern.proxy.dynamic.model.StationPort;

/**
 * @Description 车站接口
 * @Author: Q-WHai
 * @Date: Created in 10:47 2019/04/10
 */
public interface IStation extends ITicketable {

    // 余票查询
    int ticketSurplus(StationPort from, StationPort to);

    // 修正余票信息
    void amendTicketSurplus(StationPort from, StationPort to);
}
