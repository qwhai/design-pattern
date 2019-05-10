package design.pattern.command.cmd;

import design.pattern.command.Widget;

/**
 * 加载完成命令
 *
 * @Description TODO
 * @Author Q-WHai
 * @Date 2019/4/13 14:40
 */
public class LoadedCommand implements Command {

    private Widget widget;

    public LoadedCommand(Widget widget) {
        this.widget = widget;
    }

    @Override
    public void execute() {
        widget.loaded();
    }
}
