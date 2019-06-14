package pers.hai.sample.dp.cor;

/**
 * TODO
 * <p>
 * Create Time: 2019-06-14 17:18
 * Last Modify: 2019-06-14
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class OddSupport extends Support {

    public OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return 1 == trouble.getNumber() % 2;
    }
}
