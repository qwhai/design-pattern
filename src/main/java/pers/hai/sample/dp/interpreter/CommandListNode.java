package pers.hai.sample.dp.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 * <p>
 * Create Time: 2019-06-14 17:49
 * Last Modify: 2019-06-14
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class CommandListNode extends Node {

    private List<Node> list = new ArrayList<>();

    @Override
    public void parse(Context context) throws ParseException {
        while (true) {
            if (null == context.currentToken())
                throw new ParseException("Missing 'end'");
            else if (context.currentToken().equals("end")) {
                context.skipToken("end");
                break;
            } else {
                Node commandNode = new CommandNode();
                commandNode.parse(context);
                list.add(commandNode);
            }
        }
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
