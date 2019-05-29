package pers.hai.sample.dp.decorator;

/**
 * TODO
 *
 * Create Time: 2019-04-10 18:01
 * Last Modify: 2019-05-24
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public abstract class Display {

    abstract int getRows();
    abstract int getColumns();
    abstract String getRowText(int row);

    public void show() {
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
