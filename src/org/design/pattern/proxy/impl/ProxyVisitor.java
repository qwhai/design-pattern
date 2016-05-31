package org.design.pattern.proxy.impl;

import org.design.pattern.proxy.excp.RoleExcption;
import org.design.pattern.proxy.interf.Visitor;

/**
 * <p>
 * 访问者代理
 * </p>
 * 2015年12月14日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1
 */
public class ProxyVisitor implements Visitor {

    private Visitor visitor = null;
    
    public ProxyVisitor() {
        // 默认情况是游客
        visitor = new Tourist();
    }
    
    public ProxyVisitor(Visitor _visitor) {
        visitor = _visitor;
    }
    
    @Override
    public void visit() throws RoleExcption {
        visitor.visit();
    }

    @Override
    public void publish() throws RoleExcption {
        if (visitor instanceof Tourist) {
            throw new RoleExcption("游客不能发表主题，请先注册帐号");
        }
        
        visitor.publish();
    }

    @Override
    public void comment() throws RoleExcption {
        if (visitor instanceof Tourist) {
            throw new RoleExcption("游客不能发表评论，请先注册帐号");
        }
        
        visitor.comment();
    }

    @Override
    public void remove() throws RoleExcption {
        if (!(visitor instanceof Manager)) {
            throw new RoleExcption("只有管理员才可以删除主题");
        }
        
        visitor.remove();
    }

}
