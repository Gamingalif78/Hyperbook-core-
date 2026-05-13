package com.hyperbook.gui;

import com.hyperbook.utils.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class HyperBookGUI {

    public static final String TITLE = "§6HyperBooks";

    public static void open(Player player) {

        Inventory gui = Bukkit.createInventory(null, 27, TITLE);

        gui.setItem(11, ItemBuilder.create(
                Material.BOOK,
                "§eMob Power HyperBook",
                "§7Status: §cNot Equipped",
                "§eClick to Equip"
        ));

        gui.setItem(13, ItemBuilder.create(
                Material.BARRIER,
                "§cLocked HyperBook",
                "§7Not Obtained"
        ));

        gui.setItem(15, ItemBuilder.create(
                Material.ENCHANTED_BOOK,
                "§aMining HyperBook",
                "§7Status: §aEquipped",
                "§eClick to Unequip"
        ));

        player.openInventory(gui);
    }
}
