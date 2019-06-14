package pers.hai.sample.dp.interpreter;

/**
 * TODO
 * <p>
 * Create Time: 2019-06-14 17:46
 * Last Modify: 2019-06-14
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class ProgramNode extends Node {

    private Node commandListNode;

    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("program");
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    @Override
    public String toString() {
        return String.format("[program %s]", commandListNode);
    }
}
