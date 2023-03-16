package me.huanmeng.opensource.bukkit.gui.interfaces;

import me.huanmeng.opensource.bukkit.gui.GuiButton;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;

/**
 * 2023/3/17<br>
 * Gui<br>
 *
 * @author huanmeng_qwq
 */
public interface GuiClick {
    boolean allowClick(Player player, GuiButton button, ClickType clickType, InventoryAction action, InventoryType.SlotType slotType, int slot, int hotBar, InventoryClickEvent e);
}
