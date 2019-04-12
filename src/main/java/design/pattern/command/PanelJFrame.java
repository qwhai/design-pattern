package design.pattern.command;

import design.pattern.command.drawer.DrawCanvas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @Description TODO
 * @Author: Q-WHai
 * @Date: Created in 18:46 2019/04/12
 */
public class PanelJFrame extends JFrame implements ActionListener, MouseMotionListener, WindowListener {

    private MacroCommand history = new MacroCommand();
    private DrawCanvas canvas = new DrawCanvas(400, 400, history);
    private JButton clearButton = new JButton("clear");

    public PanelJFrame(String title) {
        super(title);

        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);
        clearButton.addActionListener(this);

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);

        getContentPane().add(mainBox);

        pack();
        show();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO
        if (e.getSource() == clearButton) {
            history.clear();
            canvas.repaint();
        }
    }

    @Override
    public boolean mouseMove(Event evt, int x, int y) {
        return super.mouseMove(evt, x, y);
    }

    @Override
    public boolean mouseDrag(Event evt, int x, int y) {
        return super.mouseDrag(evt, x, y);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO
    }

    @Override
    public void windowOpened(WindowEvent e) {
        // TODO
    }

    @Override
    public void windowClosed(WindowEvent e) {
        // TODO
    }

    @Override
    public void windowIconified(WindowEvent e) {
        // TODO
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        // TODO
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        // TODO
    }

    @Override
    public void windowActivated(WindowEvent e) {
        // TODO
    }

    @Override
    public void windowClosing(WindowEvent e) {
        // TODO
    }
}
