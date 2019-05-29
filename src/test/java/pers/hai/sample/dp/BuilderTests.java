package pers.hai.sample.dp;

import org.junit.Test;
import pers.hai.sample.dp.builder.Director;
import pers.hai.sample.dp.builder.HTMLBuilder;
import pers.hai.sample.dp.builder.TextBuilder;

/**
 * TODO
 * <p>
 * Create Time: 2019/5/25 23:36
 * Last Modify: 2019/5/25
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class BuilderTests extends Testable {

    @Test
    public void testPlain() {
        TextBuilder builder = new TextBuilder();
        Director director = new Director(builder);
        director.construct();

        String result = builder.getResult();
        logger.info(result);
    }

    @Test
    public void testHTML() {
        HTMLBuilder builder = new HTMLBuilder();
        Director director = new Director(builder);
        director.construct();

        String fileName = builder.getResult();
        logger.info(String.format("%s文件编写完成", fileName));
    }
}
