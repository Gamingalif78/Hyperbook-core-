package com.hyperbook.commands;

import com.hyperbook.gui.HyperBookGUI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HyperBookCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player player)) {
            sender.sendMessage("Only players can use this!");
            return true;
        }

        HyperBookGUI.open(player);
        return true;
    }
}
