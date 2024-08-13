package io.github.sgtsegment.wear_anything;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            switch (s) {
                case "wear":
                    wear(((Player) commandSender).getPlayer());
            }
            return true;
        } else {
            return true;
        }
    }

    void wear(Player p) {
        if (p.getInventory().getItemInMainHand().getType() == Material.AIR) {
            return;
        }
        ItemStack item = p.getInventory().getItemInMainHand().clone();
        item.setAmount(1);
        if (p.getInventory().getHelmet() != null) {
            // p.sendMessage(p.getInventory().getHelmet().getType().name());
            p.getInventory().addItem(p.getInventory().getHelmet());
        }
        p.getInventory().setHelmet(item);
        p.getInventory().getItemInMainHand().setAmount(p.getInventory().getItemInMainHand().getAmount()-1);
    }
}
