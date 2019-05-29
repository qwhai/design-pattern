package pers.hai.sample.dp.singleton;

import java.util.UUID;

/**
 * Last Modify: 2019-05-24
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Settings {

    private String uuid;

    private static Settings instance;

    public static Settings getInstance() {
        if (null == instance) instance = new Settings();

        return instance;
    }

    public String getUuid() {
        return uuid;
    }

    private Settings()
    {
        uuid = UUID.randomUUID().toString();
    }
}
