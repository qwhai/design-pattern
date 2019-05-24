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
public class FullBorder extends Border {

    private Display display;

    public FullBorder(Display display) {
        this.display = display;
    }

    @Override
    int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override
    int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    String getRowText(int row) {
        if (0 == row || getRows() - 1 == row) return generateLine();
        return String.format("|%s|", display.getRowText(row - 1));
    }

    private String generateLine() {
        StringBuilder sb = new StringBuilder();
        sb.append('+');
        for (int i = 0; i < display.getColumns(); i++) {
            sb.append('-');
        }
        sb.append('+');

        return sb.toString();
    }
}
