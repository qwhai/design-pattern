package design.pattern.command.drawer;

import design.pattern.command.MacroCommand;

import java.awt.*;

/**
 * @Description TODO
 * @Author: Q-WHai
 * @Date: Created in 18:19 2019/04/12
 */
public class DrawCanvas extends Canvas implements IDrawable {

    private Color color =  Color.RED;
    private int radius = 6;
    private MacroCommand history; // 命令行的历史记录

    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.WHITE);
        this.history = history;
    }

    @Override
    public void draw(double x, double y) {
        Graphics g = getGraphics();
        g.setColor(this.color);
        g.fillOval((int)x - radius, (int)y - radius, radius * 2, radius * 2);
    }

    @Override
    public void setSize(int width, int height) {
        super.setSize(width, height);
    }

    @Override
    public void setBackground(Color c) {
        super.setBackground(c);
    }

    @Override
    public void paint(Graphics g) {
        history.execute();
    }
}
