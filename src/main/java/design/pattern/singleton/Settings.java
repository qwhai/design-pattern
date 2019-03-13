package design.pattern.singleton;

import java.util.UUID;

class Settings {

    private String uuid;

    private static Settings instance;

    static Settings getInstance() {
        if (null == instance) instance = new Settings();

        return instance;
    }

    String getUuid() {
        return uuid;
    }

    private Settings()
    {
        uuid = UUID.randomUUID().toString();
    }
}
