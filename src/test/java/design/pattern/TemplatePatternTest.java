package design.pattern;

import design.pattern.template.AbstractDisplay;
import design.pattern.template.CharDisplay;
import design.pattern.template.StringDisplay;
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
