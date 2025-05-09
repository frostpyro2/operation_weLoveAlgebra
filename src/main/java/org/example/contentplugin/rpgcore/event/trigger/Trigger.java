package org.example.contentplugin.rpgcore.event.trigger;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class Trigger implements Listener {

    @EventHandler
    public void damageDealt(EntityDamageByEntityEvent event){

    }

    @EventHandler
    public void click(PlayerInteractEvent event){

    }
}
