package su.nightexpress.nexshop.api.shop.packer;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import su.nightexpress.nightcore.config.FileConfig;

import java.util.function.UnaryOperator;

public interface ProductPacker {

    @NotNull UnaryOperator<String> replacePlaceholders();

    void write(@NotNull FileConfig config, @NotNull String path);

    @NotNull ItemStack getPreview();

    void setPreview(@NotNull ItemStack preview);

    default boolean hasSpace(@NotNull Inventory inventory) {
        int space = this.countSpace(inventory);
        return space != 0;
    }

    int countSpace(@NotNull Inventory inventory);

    void delivery(@NotNull Inventory inventory, int count);

    void take(@NotNull Inventory inventory, int count);

    int count(@NotNull Inventory inventory);

    int getUnitAmount();
}
