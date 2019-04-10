package design.pattern.decorator;

/**
 * @Description TODO
 * @Author: Q-WHai
 * @Date: Created in 18:01 2019/04/10
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
