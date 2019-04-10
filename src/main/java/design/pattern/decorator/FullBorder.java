package design.pattern.decorator;

/**
 * @Description TODO
 * @Author: Q-WHai
 * @Date: Created in 18:01 2019/04/10
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
