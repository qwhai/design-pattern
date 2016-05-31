package org.design.pattern.prototype.model;

/**
 * <p>
 * 本实验中要用到的拷贝接口
 * </p>
 * 2016年3月3日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1.1
 */
public interface PrototypeCloneable extends Cloneable {

    public Object clone() throws CloneNotSupportedException;
}
