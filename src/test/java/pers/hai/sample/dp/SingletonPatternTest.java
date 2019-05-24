package pers.hai.sample.dp;

import pers.hai.sample.dp.singleton.Settings;
import pers.hai.sample.dp.singleton.Settings2;
import org.junit.Assert;
import org.junit.Test;

/**
 * TODO
 *
 * Create Time: 2019-04-12 18:10
 * Last Modify: 2019-05-24
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
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
