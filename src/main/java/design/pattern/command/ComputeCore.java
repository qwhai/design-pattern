package design.pattern.command;

/**
 * TODO
 * <p>
 * Create Time: 2019-05-20 10:45
 * Last Modify: 2019-05-20
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
class ComputeCore {

    double add(double x, double y) {
        return x + y;
    }

    double sub(double x, double y) {
        return x - y;
    }

    double mul(double x, double y) {
        return x * y;
    }

    double div(double x, double y) {
        return x / y;
    }
}
