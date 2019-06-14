package pers.hai.sample.dp;

import org.junit.Test;
import pers.hai.sample.dp.interpreter.Context;
import pers.hai.sample.dp.interpreter.Node;
import pers.hai.sample.dp.interpreter.ParseException;
import pers.hai.sample.dp.interpreter.ProgramNode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * TODO
 * <p>
 * Create Time: 2019-06-14 17:36
 * Last Modify: 2019-06-14
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class InterpreterTests extends Testable {

    @Test
    public void test1() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("H:\\program.txt"));
            String text;
            while (null != (text = reader.readLine())) {
                logger.info(String.format("text = %s", text));
                Node node = new ProgramNode();
                node.parse(new Context(text));
                logger.info(String.format("node = %s", node));
            }
        } catch (IOException | ParseException ex) {
            logger.error(ex.getMessage());
        }
    }
}
