package org.design.pattern.proxy.impl;

import org.design.pattern.proxy.interf.Visitor;

/**
 * <p>
 * 游客
 * </p>
 * 2015年12月14日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1
 */
public class Tourist implements Visitor {

    @Override
    public void visit() {
        System.out.println("我是一名游客，我访问了这个主题");
    }

    @Override
    public void publish() {
        System.out.println("我是一名游客，我居然发表了一个主题");
    }

    @Override
    public void comment() {
        System.out.println("我是一名游客，我居然评论了一个主题");
    }

    @Override
    public void remove() {
        System.out.println("我是一名游客，我居然删除了一个主题");
    }
}
