package design.pattern.proxy.access;

/**
 * @Description TODO
 * @Author Q-WHai
 * @Date 2019/4/7 22:27
 */
public class UnauthorizedException extends Exception {

    public UnauthorizedException() {
        super();
    }

    public UnauthorizedException(String message) {
        super(message);
    }
}
