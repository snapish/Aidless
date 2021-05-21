package com.example.aidless;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Resource {

    public String name; //the name of the resource
    public long ownedByPlayer;// how many total the player owns
    public long availableToPlayer; //how many are available to be assigned/spent by the player
    public ArrayList<String> requiredBy; //what other things in the game require the consumption of this resource TODO: ADD A CLASS FOR SOMETHING LIKE A TOWER THAT YOU SPEND RESOURCES FOR
    public ArrayList<Node> obtainedBy; //what node(s) this resource comes from, example driftwood comes from beach nodes
    public ArrayList<Book> booksUsedIn; //what books/chapters/w\e the resource is used in, definitely make an object for that when the idea is more concrete

    /*
     * Creates a default resource object with all barebones dummy data
     */
    public Resource(){
        this.name = "test resource";
        this.ownedByPlayer = 0;
        this.availableToPlayer = 1;
        this.requiredBy = new ArrayList<>();
        this.requiredBy.add("test requirement");
        this.obtainedBy = new ArrayList<>();
        this.obtainedBy.add(new Node());
        this.booksUsedIn = new ArrayList<>();
        this.booksUsedIn.add(new Book());
    }
}
