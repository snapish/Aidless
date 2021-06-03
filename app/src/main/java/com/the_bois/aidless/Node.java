package com.the_bois.aidless;

import java.util.ArrayList;

/*
* A node can be thought of a as an object that gives players resources, or takes them and uses them
* The idea is that a node gives the player something in exchange for something
* A node could reward resources based on how many resources are assigned to it
* Or it could take things given, maybe its only used once and not continuously but that should probably be a different class
*/
public class Node {

    public double gainedPerHour; //the number we display for x/hour. Example is a little display showing a picture of a person with "0.3 per hour". This would be changed via the ChargeRate
    public String name; //a good name
    public int resourcesAssigned; //used in the charge rate equation
    public int numberAvailableToPlayer; //how many of this resource the person owns
    public boolean locked; // whether or not the player can use it
    public ArrayList<Resource> resourceTaken ;  //what kind of resource the node takes away, could let it take more than one for more complex
    public ArrayList<Resource> resourceGiven; //names/types of what it gives to the player. Could be used for things like display name of the node or for code like, "all nodes that give x do y"


    public interface chargeRate{

    //lets later pass a lambda here for letting us define the nodes charge rate. Example, maybe we want a person node have severely diminished returns after a certain point

    }

    /*
     * Creates a default Node object with all barebones dummy data
     */
    public Node(Resource resource){
        this.gainedPerHour = 1.0;
        this.name = "test name";
        this.resourcesAssigned = 0;
        this.numberAvailableToPlayer = 0;
        this.locked = false;
        ArrayList<Resource> temp1 = new ArrayList<>();
        ArrayList<Resource> temp2 = new ArrayList<>();
        temp1.add(resource);
        temp2.add(resource);
        this.resourceTaken = temp1;
        this.resourceGiven = temp2;
    }
    /*
    idr what this constructor is technically called but it lets u make a real node
     */
    public Node(String n, double gph, int wa, int natp, ArrayList<Resource> rt, ArrayList<Resource> rg, boolean l, Page r){
        this.name = n;
        this.resourceGiven = rg;
        this.resourceTaken = rt;
        this.numberAvailableToPlayer = natp;
        this.resourcesAssigned =wa;
        this.gainedPerHour = gph;
        this.locked = l;
    }

    public void clickProgress(){

    }

    public void giveResource(){
        //thinking something like a promise that adds a resource to a player's collection after a certain time period
        //the time it takes could change if resources changes, so for example i have a node that gives me fish. Call this function each time the player (un)assigns a person to the node and...
        //... use the chargeRate equation to find out the timeStamp to give them their next fish
        //have to also think about how to add a easy way to turn on and off "cheating" via changing the phones time for development and real play purposes
    }

}
