package org.design.pattern.composite;

import java.util.Iterator;

/**
 * <p>
 * 针对 MenuItem 编写特定的空迭代
 * 这样做就可以让简单元素跟复杂之间更加模糊
 * </p>
 * Create Date: 2016年5月17日
 * Last Modify: 2016年5月17日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.0.1
 */
public class NullIterator implements Iterator<MenuComponent> {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuComponent next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
