package cobblemon.n1npogo.item;

import cobblemon.n1npogo.CobblemonGo;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(CobblemonGo.MOD_ID, name), item);
    }
    public static final Item GIFT = registerItem("gift", new Item(new Item.Settings()));

    public static void registerModItems() {
        CobblemonGo.LOGGER.info("Registering Mod Items for " + CobblemonGo.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.add(GIFT);
        });
    }
}
