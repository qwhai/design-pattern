package pers.hai.sample.dp.command;

/**
 * 表示可计算接口
 *
 * Create Time: 2019-05-20 10:30
 * Last Modify: 2019-05-20
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public interface Computable {
    void add(double x);
    void sub(double x);
    void mul(double x);
    void div(double x);

    void undo();
    void redo();
}
