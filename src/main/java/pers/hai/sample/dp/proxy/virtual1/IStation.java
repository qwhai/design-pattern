package pers.hai.sample.dp.proxy.virtual1;

/**
 * 车站接口
 *
 * Create Time: 2019-04-05 22:23
 * Last Modify: 2019-05-24
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public interface IStation extends ITicketable {
    int ticketSurplus(String start, String end);
}
