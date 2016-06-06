package org.design.pattern.state.state;

import org.design.pattern.state.context.Context;

/**
 * 在停止状态下能做什么事情
 */
public class StoppingState extends LiftState {
    
    @Override
    public void close() {
        // do nothing;
    }

    @Override
    public void open() {
        super.context.setLiftState(Context.openningState);
        super.context.getLiftState().open();
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.runningState);
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止了...");
    }
}