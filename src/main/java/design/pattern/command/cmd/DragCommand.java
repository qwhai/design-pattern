package design.pattern.command.cmd;

import design.pattern.command.Dragable;

/**
 * 拖拽命令
 *
 * @Description TODO
 * @Author Q-WHai
 * @Date 2019/4/13 14:41
 */
public class DragCommand implements Command {

    private Dragable dragable;
    private int x;
    private int y;

    public DragCommand(Dragable dragable, int x, int y) {
        this.dragable = dragable;
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {
        dragable.drag(x, y);
    }
}
