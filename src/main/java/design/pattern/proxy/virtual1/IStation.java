package design.pattern.proxy.virtual1;

/**
 * @Description 车站接口
 * @Author Q-WHai
 * @Date 2019/4/5 22:23
 */
public interface IStation extends ITicketable {
    int ticketSurplus(String start, String end);
}
