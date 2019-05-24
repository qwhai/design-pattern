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
public class SideBorder extends Border {

    private Display display;
    private char left = '{';
    private char right = '}';

    public SideBorder(Display display) {
        this.display = display;
    }

    public SideBorder(Display display, char ch) {
        this.display = display;
        this.left = ch;
        this.right = ch;
    }

    public SideBorder(Display display, char left, char right) {
        this.display = display;
        this.left = left;
        this.right = right;
    }

    @Override
    int getRows() {
        return display.getRows();
    }

    @Override
    int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    String getRowText(int row) {
        return String.format("%s%s%s", left, display.getRowText(row), right);
    }
}
