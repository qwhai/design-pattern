package design.pattern.singleton;

import java.util.UUID;

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
