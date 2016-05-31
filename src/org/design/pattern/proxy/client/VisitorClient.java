package org.design.pattern.proxy.client;

import org.design.pattern.proxy.impl.ProxyVisitor;
import org.design.pattern.proxy.impl.Tourist;
import org.utils.naga.threads.ThreadUtils;
import org.design.pattern.proxy.excp.RoleExcption;
import org.design.pattern.proxy.impl.Manager;
import org.design.pattern.proxy.impl.Member;

/**
 * <p>
 * 客户端测试
 * </p>
 * 2015年12月14日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1
 */
public class VisitorClient {

    public static void main(String[] args) {
        Manager manager = new Manager();
        Member member = new Member();
        Tourist tourist = new Tourist();
        
        ProxyVisitor visitor = null;
        System.out.println("------------------- 1 --------------------");
        try {
            visitor = new ProxyVisitor(manager);
            visitor.visit();
            visitor.publish();
            visitor.comment();
            visitor.remove();
        } catch (RoleExcption e) {
            System.err.println(e);
        }
        ThreadUtils.sleep(50);
        
        System.out.println("------------------- 2 --------------------");
        try {
            visitor = new ProxyVisitor(member);
            visitor.visit();
            visitor.publish();
            visitor.comment();
            visitor.remove();
        } catch (RoleExcption e) {
            System.err.println(e);
        }
        ThreadUtils.sleep(50);
        
        System.out.println("------------------- 3 --------------------");
        try {
            visitor = new ProxyVisitor(tourist);
            visitor.visit();
            visitor.publish();
            visitor.comment();
            visitor.remove();
        } catch (RoleExcption e) {
            System.err.println(e);
        }
    }
}
