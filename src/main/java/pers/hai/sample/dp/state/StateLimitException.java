package pers.hai.sample.dp.state;

/**
 * TODO
 *
 * Create Time: 2019-04-10 17:00
 * Last Modify: 2019-05-24
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class StateLimitException extends RuntimeException {

    public StateLimitException() {
        super();
    }

    public StateLimitException(String message) {
        super(message);
    }
}
