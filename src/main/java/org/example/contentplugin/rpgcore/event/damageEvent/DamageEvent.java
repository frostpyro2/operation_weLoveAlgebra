package org.example.contentplugin.rpgcore.event.damageEvent;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class DamageEvent extends Event {

    private static HandlerList handlerList;

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }

    public static HandlerList getHandlerList(){
        return handlerList;
    }
}
