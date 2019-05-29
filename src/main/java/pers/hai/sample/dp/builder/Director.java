package pers.hai.sample.dp.builder;

/**
 * 文档类
 *
 * Create Time: 2019/5/25 23:19
 * Last Modify: 2019/5/25
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("从早上到下午");
        builder.makeItems(new String[] {
                "早上好。",
                "下午好。"
        });
        builder.makeString("晚上");
        builder.makeItems(new String[] {
                "晚上好。",
                "晚安。"
        });
        builder.close();
    }
}
