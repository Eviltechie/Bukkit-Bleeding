package org.bukkit.event.entity;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.HandlerList;

/**
 * Called when a LivingEntity changes a block
 *
 * This event specifically excludes player entities
 */
public class EntityChangeBlockEvent extends EntityFormBlockEvent {

    public EntityChangeBlockEvent(final LivingEntity what, final Block block, final Material to, final byte data) {
        super(what, block, to, data);
    }

    public EntityChangeBlockEvent(final LivingEntity what, final Block block, final Material to) {
        super(what, block, to, (byte) 0);
    }

    @Override
    public LivingEntity getEntity() {
        return (LivingEntity) entity;
    }

    public static HandlerList getHandlerList() {
        return EntityFormBlockEvent.getHandlerList();
    }
}
