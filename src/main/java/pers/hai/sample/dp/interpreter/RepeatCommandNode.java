package pers.hai.sample.dp.interpreter;

/**
 * TODO
 * <p>
 * Create Time: 2019-06-14 17:49
 * Last Modify: 2019-06-14
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class RepeatCommandNode extends Node {

    private int number;
    private Node commandListNode;

    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("repeat");
        number = context.currentNumber();
        context.nextToken();
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    @Override
    public String toString() {
        return String.format("[repeat %d %s]", number, commandListNode);
    }
}
