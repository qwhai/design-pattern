package org.design.pattern.iterator.interf;

import java.util.Iterator;

import org.design.pattern.iterator.bean.MenuItem;

/**
 * <p>
 * 菜单的通用接口
 * </p>
 * 2016年3月4日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1.1
 */
public interface Menu {

    public Iterator<MenuItem> createIterator();
}
