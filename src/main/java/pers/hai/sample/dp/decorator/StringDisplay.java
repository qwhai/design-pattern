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
