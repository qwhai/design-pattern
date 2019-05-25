package pers.hai.sample.dp.builder;

/**
 * TODO
 * <p>
 * Create Time: 2019/5/25 23:20
 * Last Modify: 2019/5/25
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class TextBuilder extends Builder {

    private StringBuilder sb = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        sb.append("=========================\n");
        sb.append(String.format("『%s』\n", title));
        sb.append("\n");
    }

    @Override
    public void makeString(String content) {
        sb.append(String.format("·%s\n", content));
        sb.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (String item : items) {
            sb.append(String.format("  ·%s\n", item));
        }
        sb.append("\n");
    }

    @Override
    public void close() {
        sb.append("=========================\n");
    }

    public String getResult() {
        return sb.toString();
    }
}
