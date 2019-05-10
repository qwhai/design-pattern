package design.pattern;

import design.pattern.command.Button;
import design.pattern.command.Label;
import design.pattern.command.MacroCommand;
import design.pattern.command.Widget;
import design.pattern.command.cmd.Command;
import design.pattern.command.cmd.ContentChangedCommand;
import design.pattern.command.cmd.DragCommand;
import design.pattern.command.cmd.LoadedCommand;
import org.junit.Test;

/**
 * @Description TODO
 * @Author: Q-WHai
 * @Date: Created in 18:05 2019/04/12
 */
public class CommandPatternTest {

    @Test
    public void test1() {
        Button button = new Button("button1");
        {
            Command cmd1 = new LoadedCommand(button);
            cmd1.execute();
            Command cmd2 = new DragCommand(button, 1, 1);
            cmd2.execute();
            Command cmd3 = new ContentChangedCommand(button, "button-1");
            cmd3.execute();
        }

        Label label = new Label("label1");
        {
            Command cmd1 = new LoadedCommand(label);
            cmd1.execute();
            Command cmd2 = new DragCommand(label, 1, 1);
            cmd2.execute();
            Command cmd3 = new ContentChangedCommand(label, "button-1");
            cmd3.execute();
        }
    }

    @Test
    public void test2() {
        Label label = new Label("lable2");
        Command[] cmds = new Command[] {
                new DragCommand(label, 1, 1),
                new DragCommand(label, 2, 1),
                new DragCommand(label, 3, 1),
                new DragCommand(label, 4, 1),
                new DragCommand(label, 4, 2),
                new DragCommand(label, 4, 3),
                new DragCommand(label, 4, 4),
        };

        MacroCommand command = new MacroCommand();
        for (Command c : cmds) {
            command.append(c);
        }

        command.execute();
    }
}
