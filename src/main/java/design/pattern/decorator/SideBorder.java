package design.pattern.decorator;

/**
 * @Description TODO
 * @Author: Q-WHai
 * @Date: Created in 18:01 2019/04/10
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
