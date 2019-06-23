package models;

import java.net.HttpRetryException;
import java.util.ArrayList;
import java.util.List;

public class Squad {

    private String squadName;
    private int squadSize;
    private String cause;
    private Hero newMember;
    private ArrayList<Hero>  squadMembers = new ArrayList<>();
    private static ArrayList<Hero>  testSquadMembers = new ArrayList<>();
    private static ArrayList<Squad> instances = new ArrayList<>();


    public Squad(String name, int size, String cause,ArrayList<Hero> members ){
        squadName = name;
        squadSize = size;
        this.cause = cause;
        squadMembers = members;
//        testSquadMembers = members;
        instances.add(this);

    }

    public String getSquadName() {return squadName;}
    public int getSize() {return squadSize;}
    public String getCause() {return this.cause;}
    public static ArrayList<Squad> getInstances(){return instances;}
    public ArrayList<Hero> getSquadMembers(){
        return squadMembers;
    }
    public static ArrayList<Hero> getTestSquadMembers(){
        return testSquadMembers;
    }
    public ArrayList<Hero> setSquadMembers(ArrayList<Hero> newMember) {
        return squadMembers = newMember;
    }

    public static Squad setUpNewSquad(){return new Squad("Avengers",5,"Infinity Stone",Hero.getAllInstances());}
     public static Squad setUpNewSquad1(){return new Squad("GameBoy",5,"PUBG",Hero.getAllInstances());}

}
