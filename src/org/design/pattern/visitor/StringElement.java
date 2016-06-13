package org.design.pattern.visitor;

/**
 * <p></p>
 * Create Date: 2016年6月13日
 * Last Modify: 2016年6月13日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.0.1
 */
class StringElement implements Visitable {
    private String value;

    public StringElement(String string) {
        value = string;
    }

    public String getValue() {
        return value;
    }

    // 定义 accept 的具体内容 这里是很简单的一句调用
    public void accept(Visitor visitor) {
        visitor.visitString(this);
    }
}