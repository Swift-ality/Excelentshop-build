package su.nightexpress.nexshop.product.packer.impl;

import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.nightexpress.nexshop.product.packer.AbstractPluginItemPacker;
import su.nightexpress.nexshop.product.handler.impl.ItemsAdderHandler;

import java.util.function.UnaryOperator;

public class ItemsAdderPacker extends AbstractPluginItemPacker<ItemsAdderHandler> {

    public ItemsAdderPacker(ItemsAdderHandler handler, @NotNull String itemId, int amount) {
        super(handler, itemId, amount);
    }

    @Override
    @NotNull
    public UnaryOperator<String> replacePlaceholders() {
        return s -> s;
    }

    @Override
    @Nullable
    public ItemStack createItem() {
        return this.handler.createItem(this.itemId);
    }
}
