package me.huanmeng.opensource.bukkit.gui.button.function;

import me.huanmeng.opensource.bukkit.gui.enums.Result;
import me.huanmeng.opensource.bukkit.gui.slot.Slot;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryType;

/**
 * 2023/3/17<br>
 * Gui<br>
 *
 * @author huanmeng_qwq
 */
@FunctionalInterface
public interface PlayerClickCancelUpdateInterface extends PlayerClickInterface {
    @Override
    default Result onClick(Slot slot, Player player, ClickType click, InventoryAction action, InventoryType.SlotType slotType, int slotKey, int hotBarKey) {
        onPlayerClick(player, click, action, slotType, slotKey, hotBarKey);
        return Result.CANCEL_UPDATE;
    }

    void onPlayerClick(Player player, ClickType click, InventoryAction action, InventoryType.SlotType slotType, int slot, int hotBarKey);
}
