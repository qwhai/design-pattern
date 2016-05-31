package org.design.pattern.proxy.interf;

import org.design.pattern.proxy.excp.RoleExcption;

/**
 * <p>
 * 拥有公共的接口
 * </p>
 * 2015年12月14日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1
 */
public interface Visitor {

    public void visit() throws RoleExcption;
    
    public void publish() throws RoleExcption;
    
    public void comment() throws RoleExcption;
    
    public void remove() throws RoleExcption;
}
