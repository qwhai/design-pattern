package design.pattern.singleton;

import org.junit.Assert;
import org.junit.Test;

public class Settings2Test {

    @Test
    public void testSettingsEquals() {
        Settings2 s1 = Settings2.getInstance();
        Settings2 s2 = Settings2.getInstance();

        System.out.println(String.format("settings 1 : %s", s1.getUuid()));
        System.out.println(String.format("settings 2 : %s", s2.getUuid()));

        Assert.assertEquals(s1.getUuid(), s2.getUuid());
    }
}
