package design.pattern.state;

/**
 * @Description TODO
 * @Author: Q-WHai
 * @Date: Created in 17:00 2019/04/10
 */
public class StateLimitException extends RuntimeException {

    public StateLimitException() {
        super();
    }

    public StateLimitException(String message) {
        super(message);
    }
}
