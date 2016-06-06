package org.design.pattern.state.state;

import org.design.pattern.state.context.Context;

/**
 * 电梯门关闭以后，电梯可以做哪些事情
 */
public class ClosingState extends LiftState {
    
    @Override
    public void close() {
        System.out.println("电梯门关闭...");
    }

    @Override
    public void open() {
        super.context.setLiftState(Context.openningState); // 置为门敞状态
        super.context.getLiftState().open();
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.runningState); // 设置为运行状态；
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState); // 设置为停止状态；
        super.context.getLiftState().stop();
    }
}