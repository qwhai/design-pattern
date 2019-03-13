package design.pattern.template;

import org.junit.Test;

public class TemplateTest {

    @Test
    public void testTemplate() {
        AbstractDisplay d1 = new CharDisplay('A');
        d1.display();

        AbstractDisplay d2 = new StringDisplay("Hello, World");
        d2.display();
    }
}
