package io.BM;

import dev.EX.Funcs;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.logging.Logger;


public class Main extends JavaPlugin {
    public static Main instance;
    Logger log = getLogger();

    public void onEnable() {
        Funcs.atEnable(this, "InventoryManager");


        Funcs.regCommands(this, "inventorymanager", new invmanCMD());






    }

    public static Main getInstance() {
        return instance;
    }

}