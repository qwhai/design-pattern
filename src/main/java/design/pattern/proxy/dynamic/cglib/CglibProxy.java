package design.pattern.proxy.dynamic.cglib;

import design.pattern.proxy.dynamic.IStation;
import design.pattern.proxy.dynamic.model.StationPort;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.apache.log4j.Logger;

import java.lang.reflect.Method;

/**
 * @Description TODO
 * @Author: Q-WHai
 * @Date: Created in 16:07 2019/04/10
 */
public class CglibProxy implements MethodInterceptor {

    private Logger logger = Logger.getLogger(CglibProxy.class);
    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class clazz) {
        // 设置需要创建的子类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);

        // 通过字节码技术动态创建子类实例
        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        logBefore(methodProxy);

        Object o = methodProxy.invokeSuper(obj, args);

        logAfter(methodProxy);

        if (method.getName().equals("booking")) {
            StationPort from = (StationPort) args[0];
            StationPort to = (StationPort) args[1];
            if (0 > ((IStation)obj).ticketSurplus(from, to)) {
                logger.info("安全检查到车票已售罄");
                ((IStation)obj).amendTicketSurplus(from, to);
                logger.info("车票余量已修正");
            }
        }

        return o;
    }

    private void logBefore(MethodProxy methodProxy) {
        logger.info(String.format("在{%s}方法调用前开启的日志功能", methodProxy.getSuperName()));
    }

    private void logAfter(MethodProxy methodProxy) {
        logger.info(String.format("在{%s}方法调用后开启的日志功能", methodProxy.getSuperName()));
    }
}
