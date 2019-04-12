package design.pattern;

import design.pattern.singleton.Settings;
import design.pattern.singleton.Settings2;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Description TODO
 * @Author: Q-WHai
 * @Date: Created in 18:10 2019/04/12
 */
public class SingletonPatternTest {

    @Test
    public void test1() {
        Settings s1 = Settings.getInstance();
        Settings s2 = Settings.getInstance();

        System.out.println(String.format("settings 1 : %s", s1.getUuid()));
        System.out.println(String.format("settings 2 : %s", s2.getUuid()));

        Assert.assertEquals(s1.getUuid(), s2.getUuid());
    }

    @Test
    public void test2() {
        Settings2 s1 = Settings2.getInstance();
        Settings2 s2 = Settings2.getInstance();

        System.out.println(String.format("settings 1 : %s", s1.getUuid()));
        System.out.println(String.format("settings 2 : %s", s2.getUuid()));

        Assert.assertEquals(s1.getUuid(), s2.getUuid());
    }
}
