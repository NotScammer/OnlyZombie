package com.notscammer.onlyzombie;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;

public class EventListen implements Listener {

    @EventHandler(priority =  EventPriority.LOWEST)
    public void onSpawn(EntitySpawnEvent e){
        switch (e.getEntityType()){
            case SKELETON:
            case SKELETON_HORSE:
            case SPIDER:
            case CAVE_SPIDER:
            case BAT:
            case SLIME:
            case WITCH:
            case CREEPER:
            case PILLAGER:
            case ENDERMAN:
                e.setCancelled(true);
        }
    }
}
