package design.pattern.singleton;

import java.util.UUID;

class Settings2 {

    private String uuid;

    private volatile static Settings2 instance;

    static Settings2 getInstance() {
        if (null == instance) {
            synchronized (Settings2.class) {
                if (null == instance) {
                    instance = new Settings2();
                }
            }
        }

        return instance;
    }

    String getUuid() {
        return uuid;
    }

    private Settings2()
    {
        uuid = UUID.randomUUID().toString();
    }
}
