package org.example.contentplugin.rpgcore.data.team.guild;

import org.example.contentplugin.rpgcore.data.entity.EntityData;
import org.example.contentplugin.rpgcore.data.team.TeamSystem;

import java.util.ArrayList;
import java.util.Collection;

public class Guild implements TeamSystem {
    private EntityData leader;

    private Collection<EntityData> member = new ArrayList<>();

    @Override
    public EntityData getLeader() {
        return leader;
    }

    public void addMember(EntityData data){
        member.add(data);
    }

}
