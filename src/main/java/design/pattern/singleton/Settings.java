package design.pattern.singleton;

import java.util.UUID;

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
