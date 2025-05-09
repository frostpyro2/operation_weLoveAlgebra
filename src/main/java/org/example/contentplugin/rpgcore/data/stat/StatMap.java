package org.example.contentplugin.rpgcore.data.stat;

import org.bukkit.entity.LivingEntity;
import org.example.contentplugin.rpgcore.data.entity.EntityData;
import org.example.contentplugin.rpgcore.data.entity.EntityMap;
import org.example.contentplugin.rpgcore.data.entity.player.PlayerData;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class StatMap implements EntityData {

    private EntityMap data;

    private Map<String, StatInstance> stats = new ConcurrentHashMap<>();

    public StatMap(EntityMap data){
        this.data = data;
    }

    @Override
    public LivingEntity getEntity() {
        return data.getEntity();
    }

    @Override
    public double getStat(String stat) {
        return getStatInstance(stat).getValue();
    }

    public StatInstance getStatInstance(String key){
        return stats.computeIfAbsent(key, statID-> new StatInstance(statID, this));
    }

    public Collection<StatInstance> getStats(){
        return stats.values();
    }
}
