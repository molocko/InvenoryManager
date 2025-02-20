package io.BM;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class InvManager {
    private int state = 0;

    private int cursor = 0;

    public void setCursor(int value){
        this.cursor = value;
    }

    public static void getInventory(int profile){

    }

    public static void setupInventory(Player p){
        Inventory inv = Bukkit.createInventory(null, 54, "сосал?");
        p.openInventory(inv);
//        p.getInventory().getItem()
    }



}
