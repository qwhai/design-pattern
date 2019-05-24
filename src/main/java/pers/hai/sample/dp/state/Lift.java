package pers.hai.sample.dp.state;

/**
 * TODO
 *
 * Create Time: 2019-04-10 16:51
 * Last Modify: 2019-05-24
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Lift {

    static final State openningState = new OpenningState();
    static final State closingState = new ClosingState();
    static final State runningState = new RunningState();
    static final State stoppingState = new StoppingState();

    private State state;

    public Lift(State state) {
        switchState(state);
    }

    void switchState(State state) {
        this.state = state;
        this.state.setContext(this);
    }

    public boolean open() {
        try{
            state.open();
        } catch (StateLimitException ex) {
            ex.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean close() {
        try{
            state.close();
        } catch (StateLimitException ex) {
            ex.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean run() {
        try{
            state.run();
        } catch (StateLimitException ex) {
            ex.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean stop() {
        try{
            state.stop();
        } catch (StateLimitException ex) {
            ex.printStackTrace();
            return false;
        }

        return true;
    }
}
