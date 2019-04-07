package design.pattern.proxy.virtual1;

import org.apache.log4j.Logger;

/**
 * @Description 代售点
 * @Author Q-WHai
 * @Date 2019/4/5 22:28
 */
public class StationProxy implements ITicketable {

    private Logger logger = Logger.getLogger(StationProxy.class);

    private IStation njnStation;
    private IStation njStation;

    public StationProxy() {
        njnStation = new NanjingnanStation();
        njStation = new NanjingStation();
    }

    @Override
    public double ticketPrice(String start, String end) {
        return ticketMap.get(String.format("%s|%s", start, end));
    }

    @Override
    public void booking(String start, String end) {
        if (0 == njnStation.ticketSurplus(start, end)) logger.info(String.format("南京南站：%s到%s车票已售罄", start, end));
        if (0 == njStation.ticketSurplus(start, end)) logger.info(String.format("南京站：%s到%s车票已售罄", start, end));

        if (0 != njnStation.ticketSurplus(start, end)) {
            njnStation.booking(start, end);
            logger.info(String.format("通过代售点在南京南站买到了从%s到%s的火车票", start, end));
        } else if (0 != njStation.ticketSurplus(start, end)) {
            njStation.booking(start, end);
            logger.info(String.format("通过代售点在南京站买到了从%s到%s的火车票", start, end));
        }
    }
}
