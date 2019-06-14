package pers.hai.sample.dp.interpreter;

/**
 * TODO
 * <p>
 * Create Time: 2019-06-14 17:50
 * Last Modify: 2019-06-14
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class PrimitiveCommandNode extends Node {

    private String name;

    @Override
    public void parse(Context context) throws ParseException {
        name = context.currentToken();
        context.skipToken(name);
        if (!name.equals("go") && !name.equals("right") && !name.equals("left"))
            throw new ParseException(String.format("%s is undefined.", name));
    }

    @Override
    public String toString() {
        return name;
    }
}
