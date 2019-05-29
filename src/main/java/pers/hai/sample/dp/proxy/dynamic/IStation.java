package pers.hai.sample.dp.proxy.dynamic;

import pers.hai.sample.dp.proxy.dynamic.model.StationPort;

/**
 * 车站接口
 *
 * Create Time: 2019-04-10 10:47
 * Last Modify: 2019-05-24
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public interface IStation extends ITicketable {

    // 余票查询
    int ticketSurplus(StationPort from, StationPort to);

    // 修正余票信息
    void amendTicketSurplus(StationPort from, StationPort to);
}
