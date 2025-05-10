package org.example.contentplugin.rpgcore.data.entityInteraction.damage;

import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.example.contentplugin.rpgcore.data.entity.EntityData;
import org.example.contentplugin.rpgcore.data.entityInteraction.attack.AttackData;
import org.example.contentplugin.rpgcore.data.entityInteraction.damage.data.DamageData;


public class DamageManage {
    public AttackData findAttack(EntityDamageEvent event){
        return null;
    }

    private AttackData prototype1(EntityDamageEvent event){
        LivingEntity entity = (LivingEntity) event.getEntity();
        if(event instanceof EntityDamageByEntityEvent){

        }

        return new AttackData(entity, null, new DamageData(event.getDamage(), findType(event)));
    }

    private DamageType[] findType(EntityDamageEvent event){
        return null;
    }
}
