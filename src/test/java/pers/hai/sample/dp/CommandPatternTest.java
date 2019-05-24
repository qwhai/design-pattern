package pers.hai.sample.dp;

import org.junit.Assert;
import org.junit.Test;
import pers.hai.sample.dp.command.cmd.*;
import pers.hai.sample.dp.command.Computable;
import pers.hai.sample.dp.command.MobileCalculator;

/**
 * TODO
 * Create Time: 2019-04-12 18:05
 * Last Modify: 2019-05-24
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class CommandPatternTest extends Testable {


    @Test
    public void test1() {
        Computable computable = new MobileCalculator();
        Command cmd1 = new AddCommand(1, computable);
        Command cmd2 = new AddCommand(2, computable);

        cmd1.calculate();
        cmd2.calculate();

        Assert.assertEquals(3.0, ((MobileCalculator) computable).getResult(), 0);
    }

    @Test
    public void test2() {
        Computable computable = new MobileCalculator();
        Command cmd1 = new AddCommand(10, computable);
        Command cmd2 = new SubCommand(2, computable);

        cmd1.calculate();
        cmd2.calculate();

        Assert.assertEquals(8.0, ((MobileCalculator) computable).getResult(), 0);
    }

    @Test
    public void test3() {
        Computable computable = new MobileCalculator();
        Command cmd1 = new AddCommand(3, computable);
        Command cmd2 = new MulCommand(2, computable);

        cmd1.calculate();
        cmd2.calculate();

        Assert.assertEquals(6.0, ((MobileCalculator) computable).getResult(), 0);
    }

    @Test
    public void test4() {
        Computable computable = new MobileCalculator();
        Command cmd1 = new AddCommand(8, computable);
        Command cmd2 = new DivCommand(2, computable);

        cmd1.calculate();
        cmd2.calculate();

        Assert.assertEquals(4.0, ((MobileCalculator) computable).getResult(), 0);
    }

    @Test
    public void test5() {
        Computable computable = new MobileCalculator();
        Command cmd1 = new AddCommand(8, computable);
        Command cmd2 = new AddCommand(2, computable);

        cmd1.calculate();
        cmd2.calculate();

        // + 运算后
        Assert.assertEquals(10.0, ((MobileCalculator) computable).getResult(), 0);

        computable.undo();
        // undo 运算后
        Assert.assertEquals(8.0, ((MobileCalculator) computable).getResult(), 0);

        Command cmd3 = new SubCommand(6, computable);
        cmd3.calculate();
        // - 运算后
        Assert.assertEquals(2.0, ((MobileCalculator) computable).getResult(), 0);

        computable.undo();
        // undo 运算后
        Assert.assertEquals(8.0, ((MobileCalculator) computable).getResult(), 0);

        Command cmd4 = new MulCommand(2, computable);
        cmd4.calculate();
        // × 运算后
        Assert.assertEquals(16.0, ((MobileCalculator) computable).getResult(), 0);

        computable.undo();
        // undo 运算后
        Assert.assertEquals(8.0, ((MobileCalculator) computable).getResult(), 0);

        Command cmd5 = new DivCommand(4, computable);
        cmd5.calculate();
        // ÷ 运算后
        Assert.assertEquals(2.0, ((MobileCalculator) computable).getResult(), 0);

        computable.undo();
        // undo 运算后
        Assert.assertEquals(8.0, ((MobileCalculator) computable).getResult(), 0);
    }

    @Test
    public void test6() {
        Computable computable = new MobileCalculator();
        Command cmd1 = new AddCommand(8, computable);
        Command cmd2 = new AddCommand(2, computable);

        cmd1.calculate();
        cmd2.calculate();

        // + 运算后
        Assert.assertEquals(10.0, ((MobileCalculator) computable).getResult(), 0);

        computable.undo();
        // undo 运算后
        Assert.assertEquals(8.0, ((MobileCalculator) computable).getResult(), 0);

        computable.redo();
        // redo 运算后
        Assert.assertEquals(10.0, ((MobileCalculator) computable).getResult(), 0);
    }
}
