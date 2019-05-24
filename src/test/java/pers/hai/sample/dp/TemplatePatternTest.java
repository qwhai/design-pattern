package pers.hai.sample.dp;

import pers.hai.sample.dp.template.AbstractDisplay;
import pers.hai.sample.dp.template.CharDisplay;
import pers.hai.sample.dp.template.StringDisplay;
import org.junit.Test;

public class TemplatePatternTest {

    @Test
    public void testTemplate() {
        AbstractDisplay d1 = new CharDisplay('A');
        d1.display();

        AbstractDisplay d2 = new StringDisplay("Hello, World");
        d2.display();
    }
}
