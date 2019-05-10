package design.pattern.command2.drawer;

import design.pattern.command2.ICommand;

import java.awt.*;

/**
 * @Description TODO
 * @Author: Q-WHai
 * @Date: Created in 18:18 2019/04/12
 */
public class DrawCommand implements ICommand {

    // 绘制对象
    private IDrawable drawable;

    // 绘制位置
    private Point point;

    public DrawCommand(IDrawable drawable, Point point) {
        this.drawable = drawable;
        this.point = point;
    }

    @Override
    public void execute() {
        drawable.draw(point.x, point.y);
    }
}
