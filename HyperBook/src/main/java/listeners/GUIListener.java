package com.hyperbook.listeners;

import com.hyperbook.gui.HyperBookGUI;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class GUIListener implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e) {

        if (!e.getView().getTitle().equals(HyperBookGUI.TITLE)) return;

        e.setCancelled(true);

        if (e.getCurrentItem() == null) return;

        switch (e.getCurrentItem().getType()) {

            case BOOK -> e.getWhoClicked().sendMessage("§aEquipped HyperBook!");
            case ENCHANTED_BOOK -> e.getWhoClicked().sendMessage("§eUnequipped HyperBook!");
            case BARRIER -> e.getWhoClicked().sendMessage("§cYou don't own this!");
        }
    }
}
