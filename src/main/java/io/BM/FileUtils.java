package io.BM;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class FileUtils {


    private static File invs;
    static FileConfiguration invs_config;

    public static void setup() {
        invs = new File(Main.getInstance().getDataFolder(), "invs.yml");
        if (!invs.exists()) {
            try {
                invs.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        invs_config = YamlConfiguration.loadConfiguration(invs);
        saveConfig();

    }

    public static void saveConfig() {
        try {
            invs_config.save(invs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}





