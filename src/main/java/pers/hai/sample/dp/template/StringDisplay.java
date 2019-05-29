package pers.hai.sample.dp.template;

/**
 * Last Modify: 2019-05-24
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class StringDisplay extends AbstractDisplay {

    private int _width;
    private String _text;

    public StringDisplay(String text){
        this._text = text;
        this._width = this._text.length();
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + _text + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < _width; i ++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
