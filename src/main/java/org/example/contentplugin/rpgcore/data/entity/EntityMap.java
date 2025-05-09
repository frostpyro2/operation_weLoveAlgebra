package org.example.contentplugin.rpgcore.data.entity;

import org.bukkit.entity.LivingEntity;
import org.example.contentplugin.rpgcore.data.entity.EntityData;

public class EntityMap implements EntityData {

    private final EntityData tmp;

    public EntityMap(EntityData tmp){
        this.tmp = tmp;
    }

    @Override
    public LivingEntity getEntity() {
        return tmp.getEntity();
    }

    @Override
    public double getStat(String stat) {
        return 0;
    }
}
