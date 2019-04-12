package design.pattern;

import design.pattern.proxy.access.*;
import design.pattern.proxy.dynamic.cglib.CglibProxy;
import design.pattern.proxy.dynamic.IStation;
import design.pattern.proxy.dynamic.NanjingStation;
import design.pattern.proxy.dynamic.NanjingnanStation;
import design.pattern.proxy.dynamic.jdk.DynamicProxyHandler;
import design.pattern.proxy.dynamic.model.StationPort;
import design.pattern.proxy.virtual1.ITicketable;
import design.pattern.proxy.virtual1.StationProxy;
import design.pattern.proxy.virtual2.PrinterProxy;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * @Author: Q-WHai
 * @Date: Created in 17:11 2019/03/27
 */
public class ProxyPatternTest {

    private Logger logger = Logger.getLogger(ProxyPatternTest.class);

    // 测试虚代理1
    @Test
    public void test1() {
        ITicketable ticketable = new StationProxy();
        double price = ticketable.ticketPrice("nanjingnan", "shanghaihongqiao");
        Assert.assertEquals(144.5, price, 0);

        for (int i = 0; i < 100; i++) {
            ticketable.booking("nanjingnan", "shanghaihongqiao");
        }
    }

    // 测试虚代理2
    @Test
    public void test2() {
        PrinterProxy printerProxy = new PrinterProxy("打印机-1");
        printerProxy.print("[这里是第一次打印内容]");
        printerProxy.setName("打印机-2");
        printerProxy.print("[这里是第二次打印内容]");
    }

    // 测试Access代理：访客
    @Test
    public void test3() {
        Forum forum1 = new TouristProxy();
        try {
            forum1.createTopic();
        } catch (UnauthorizedException ex) {
            ex.printStackTrace();
        }

        try {
            forum1.moidfyTopic();
        } catch (UnauthorizedException ex) {
            ex.printStackTrace();
        }

        try {
            forum1.deleteTopic();
        } catch (UnauthorizedException ex) {
            ex.printStackTrace();
        }

        try {
            forum1.auditTopic("123");
        } catch (UnauthorizedException ex) {
            ex.printStackTrace();
        }

        try {
            forum1.visit();
        } catch (UnauthorizedException ex) {
            ex.printStackTrace();
        }

        try {
            forum1.comment();
        } catch (UnauthorizedException ex) {
            ex.printStackTrace();
        }
    }

    // 测试Access代理：题主
    @Test
    public void test4() {
        Forum forum1 = new WriterProxy();
        try {
            forum1.createTopic();
        } catch (UnauthorizedException ex) {
            ex.printStackTrace();
        }

        try {
            forum1.moidfyTopic();
        } catch (UnauthorizedException ex) {
            ex.printStackTrace();
        }

        try {
            forum1.deleteTopic();
        } catch (UnauthorizedException ex) {
            ex.printStackTrace();
        }

        try {
            forum1.auditTopic("123");
        } catch (UnauthorizedException ex) {
            ex.printStackTrace();
        }

        try {
            forum1.visit();
        } catch (UnauthorizedException ex) {
            ex.printStackTrace();
        }

        try {
            forum1.comment();
        } catch (UnauthorizedException ex) {
            ex.printStackTrace();
        }
    }

    // 测试Access代理：管理员
    @Test
    public void test5() {
        Forum forum1 = new ManagerProxy();
        try {
            forum1.createTopic();
        } catch (UnauthorizedException ex) {
            ex.printStackTrace();
        }

        try {
            forum1.moidfyTopic();
        } catch (UnauthorizedException ex) {
            ex.printStackTrace();
        }

        try {
            forum1.deleteTopic();
        } catch (UnauthorizedException ex) {
            ex.printStackTrace();
        }

        try {
            forum1.auditTopic("123");
        } catch (UnauthorizedException ex) {
            ex.printStackTrace();
        }

        try {
            forum1.visit();
        } catch (UnauthorizedException ex) {
            ex.printStackTrace();
        }

        try {
            forum1.comment();
        } catch (UnauthorizedException ex) {
            ex.printStackTrace();
        }
    }

    // 测试Dynamic代理
    @Test
    public void test6() {
        // 测试动态代理南京南站售票
        IStation station1 = new NanjingnanStation();

        DynamicProxyHandler handler1 = new DynamicProxyHandler(station1);
        IStation proxy1 = (IStation) Proxy.newProxyInstance(station1.getClass().getClassLoader(), station1.getClass().getInterfaces(), handler1);

        double price1 = proxy1.ticketPrice(new StationPort("南京南"), new StationPort("上海虹桥"));
        Assert.assertEquals(144.5, price1, 0);
        for (int i = 0; i < 10; i++) {
            proxy1.booking(new StationPort("南京南"), new StationPort("上海虹桥"));
        }

        // 测试动态代理南京站售票
        IStation station2 = new NanjingStation();
        DynamicProxyHandler handler2 = new DynamicProxyHandler(station2);
        IStation proxy2 = (IStation) Proxy.newProxyInstance(station2.getClass().getClassLoader(), station2.getClass().getInterfaces(), handler2);

        double price2 = proxy2.ticketPrice(new StationPort("武汉"), new StationPort("长沙"));
        Assert.assertEquals(164.5, price2, 0);
        for (int i = 0; i < 10; i++) {
            proxy2.booking(new StationPort("武汉"), new StationPort("长沙"));
        }
    }

    // 测试Dynamic代理
    @Test
    public void test7() {
        // 测试动态代理南京南站售票
        DynamicProxyHandler handler = new DynamicProxyHandler(new NanjingnanStation());
        IStation proxy = (IStation) Proxy.newProxyInstance(
                IStation.class.getClassLoader(),
                new Class[] { IStation.class },
                handler);

        double price = proxy.ticketPrice(new StationPort("南京南"), new StationPort("上海虹桥"));
        Assert.assertEquals(144.5, price, 0);
        for (int i = 0; i < 70; i++) {
            if (60 == i) {
                System.out.println(i);
            }

            boolean bf = proxy.booking(new StationPort("南京南"), new StationPort("上海虹桥"));
            Assert.assertTrue(bf);
        }
    }

    // 测试基于JDK方式的Dynamic代理
    @Test
    public void test8() {
        // 测试动态代理南京南站售票
        DynamicProxyHandler handler = new DynamicProxyHandler(new NanjingnanStation());
        IStation proxy = handler.newProxyInstance();

        double price = proxy.ticketPrice(new StationPort("南京南"), new StationPort("上海虹桥"));
        Assert.assertEquals(144.5, price, 0);
        for (int i = 0; i < 70; i++) {
            boolean bf = proxy.booking(new StationPort("南京南"), new StationPort("上海虹桥"));
            Assert.assertTrue(bf);
        }
    }

    // 测试基于CGLIB方式的Dynamic代理
    @Test
    public void test9() {
        CglibProxy proxy = new CglibProxy();
        IStation station = (IStation) proxy.getProxy(NanjingnanStation.class); // 通过动态生成子类的方式创建代理类

        double price = station.ticketPrice(new StationPort("南京南"), new StationPort("上海虹桥"));
        logger.info(String.format("查询到票价：%s", price));
        Assert.assertEquals(144.5, price, 0);
        for (int i = 0; i < 70; i++) {
            boolean bf = station.booking(new StationPort("南京南"), new StationPort("上海虹桥"));
            Assert.assertTrue(bf);
        }
    }
}
