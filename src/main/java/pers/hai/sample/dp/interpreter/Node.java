package pers.hai.sample.dp.interpreter;

/**
 * TODO
 * <p>
 * Create Time: 2019-06-14 17:42
 * Last Modify: 2019-06-14
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
}
