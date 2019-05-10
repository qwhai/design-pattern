package design.pattern.command.cmd;

import design.pattern.command.Widget;

/**
 * 内容变更命令
 *
 * @Description TODO
 * @Author Q-WHai
 * @Date 2019/4/13 15:08
 */
public class ContentChangedCommand implements Command {

    private Widget widget;
    private String text;

    public ContentChangedCommand(Widget widget, String text) {
        this.widget = widget;
        this.text = text;
    }

    @Override
    public void execute() {
        widget.changeContent(text);
    }
}
