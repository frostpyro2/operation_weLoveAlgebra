package org.example.contentplugin.rpgcore.data.stat;

public class StatInstance {
    private String name;

    private StatMap map;

    public StatInstance(String name, StatMap map){
        this.map = map;

        this.name = name;
    }

    public double getValue(){
        return 0;
    }

}
