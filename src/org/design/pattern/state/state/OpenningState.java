package org.design.pattern.state.state;

import org.design.pattern.state.context.Context;

/**
 * 在电梯门开启的状态下能做什么事情
 */
public class OpenningState extends LiftState {
    
    @Override
    public void close() {
        // 状态修改
        super.context.setLiftState(Context.closeingState);
        // 动作委托为CloseState来执行
        super.context.getLiftState().close();
    }

    @Override
    public void open() {
        System.out.println("电梯门开启...");
    }

    @Override
    public void run() {
        // do nothing;
    }

    // 开门还不停止？
    public void stop() {
        // do nothing;
    }
}