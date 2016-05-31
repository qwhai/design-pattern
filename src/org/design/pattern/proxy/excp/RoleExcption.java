package org.design.pattern.proxy.excp;

/**
 * <p>
 * 角色分配异常
 * (这里主要是针对分词集字典树中，是Root节点和非Root节点的角度)
 * </p>
 * 2015年12月11日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1
 */
public class RoleExcption extends Exception {

    private static final long serialVersionUID = 6634772171577358473L;

    public RoleExcption(String msg) {
        super(msg);
    }
}
