package org.example.contentplugin.rpgcore.data.entity;

import org.bukkit.entity.LivingEntity;

public interface EntityData {
    LivingEntity getEntity();
    double getStat(String stat);
    static EntityData mapping(LivingEntity entity){
        return null;
    }
}
