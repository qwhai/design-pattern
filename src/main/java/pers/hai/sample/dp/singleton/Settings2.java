package pers.hai.sample.dp.singleton;

import java.util.UUID;

/**
 * Last Modify: 2019-05-24
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Settings2 {

    private String uuid;

    private volatile static Settings2 instance;

    public static Settings2 getInstance() {
        if (null == instance) {
            synchronized (Settings2.class) {
                if (null == instance) {
                    instance = new Settings2();
                }
            }
        }

        return instance;
    }

    public String getUuid() {
        return uuid;
    }

    private Settings2()
    {
        uuid = UUID.randomUUID().toString();
    }
}
