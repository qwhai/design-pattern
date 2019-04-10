package design.pattern.decorator;

/**
 * @Description TODO
 * @Author: Q-WHai
 * @Date: Created in 18:01 2019/04/10
 */
public class StringDisplay extends Display {

    private String content;

    public StringDisplay(String content) {
        this.content = content;
    }

    @Override
    int getRows() {
        return 1;
    }

    @Override
    int getColumns() {
        return content.length();
    }

    @Override
    String getRowText(int row) {
        return 0 == row ? content : null;
    }
}
