package pers.hai.sample.dp.builder;

/**
 * 定义决定文档结构的方法的抽象类
 *
 * Create Time: 2019/5/25 23:19
 * Last Modify: 2019/5/25
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String content);
    public abstract void makeItems(String[] items);
    public abstract void close();
}
