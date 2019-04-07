package design.pattern.proxy;

import design.pattern.proxy.access.*;
import design.pattern.proxy.virtual1.ITicketable;
import design.pattern.proxy.virtual1.StationProxy;
import design.pattern.proxy.virtual2.PrinterProxy;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Q-WHai
 * @Date: Created in 17:11 2019/03/27
 */
public class ProxyTest {

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
}
