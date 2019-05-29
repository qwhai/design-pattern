package pers.hai.sample.dp.bridge;

/**
 * TODO
 * <p>
 * Create Time: 2019-05-29 18:01
 * Last Modify: 2019-05-29
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class StringDisplayImpl extends DisplayImpl {

    private String label;
    private int width;

    public StringDisplayImpl(String label) {
        this.label = label;
        this.width = label.getBytes().length;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println(String.format("|%s|", label));
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
