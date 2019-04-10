package design.pattern.proxy.dynamic.jdk;

import design.pattern.proxy.dynamic.IStation;
import design.pattern.proxy.dynamic.model.StationPort;
import org.apache.log4j.Logger;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: Q-WHai
 * @Date: Created in 10:46 2019/04/10
 */
public class DynamicProxyHandler implements InvocationHandler {

    private Logger logger = Logger.getLogger(DynamicProxyHandler.class);
    private IStation station;

    public DynamicProxyHandler(IStation station) {
        this.station = station;
    }

    public IStation newProxyInstance() {
        return (IStation) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        logBefore(method);

        Object o = method.invoke(station, args);

        logAfter(method);

        if (method.getName().equals("booking")) {
            StationPort from = (StationPort) args[0];
            StationPort to = (StationPort) args[1];
            if (0 > station.ticketSurplus(from, to)) {
                logger.info("安全检查到车票已售罄");
                station.amendTicketSurplus(from, to);
                logger.info("车票余量已修正");
            }
        }

        return o;
    }

    private void logBefore(Method method) {
        logger.info(String.format("在{%s}方法调用前开启的日志功能", method.getName()));
    }

    private void logAfter(Method method) {
        logger.info(String.format("在{%s}方法调用后开启的日志功能", method.getName()));
    }
}
