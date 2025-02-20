package io.BM;

import dev.EX.Funcs;
import dev.EX.ZZPlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class invmanCMD implements CommandExecutor {
    // GUI, RELOAD, INVSEE
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(!(commandSender instanceof Player)){
            Funcs.sendMsg(commandSender, "Комманда доступна только игрокам!");
            return true;
        }
        Player p = (Player) commandSender;
        ZZPlayer zzp = new ZZPlayer(p);

        if(strings.length == 0) return true;


        if(Funcs.itIs(strings, 0,"gui")){
            zzp.sendMsg("&bГУИ");
            InvManager.setupInventory(p);
        }





        return true;
    }
}
