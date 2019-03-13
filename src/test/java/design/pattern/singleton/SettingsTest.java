package design.pattern.singleton;

import org.junit.Assert;
import org.junit.Test;

public class SettingsTest {

    @Test
    public void testSettingsEquals() {
        Settings s1 = Settings.getInstance();
        Settings s2 = Settings.getInstance();

        System.out.println(String.format("settings 1 : %s", s1.getUuid()));
        System.out.println(String.format("settings 2 : %s", s2.getUuid()));

        Assert.assertEquals(s1.getUuid(), s2.getUuid());
    }
}
