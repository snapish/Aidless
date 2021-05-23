package com.example.aidless;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Page {
    public String name;
    public String objective; //something like "obtain x amount of resource Y" , or spend X time doing something w\e the goal is
    public static int numberOfPages;
    public static ArrayList<String> resourceNames;

    /*
     * Creates a default page object with all barebones dummy data
     */
    public Page(){
        this.name = "test name";
        this.objective = "test objective";
        numberOfPages += 1;
    }

    /*
    * Takes any number of Resource and Integer maps that will validate and then give the player a reward
    * TODO ADD SOME OPERATION TO MOVE THE PLAYER TO THE NEXT PAGE IN THE CHAPTER
    */
    @RequiresApi(api = Build.VERSION_CODES.N)
    public void endingReward(HashMap<String, Integer>... rews){
        resourceNames = new ArrayList<String>();
        resourceNames.add("test resource");
        resourceNames.forEach((name) -> { // for each resource name that exists...
            for(HashMap<String, Integer> rewardsMap : rews) {// ...and for each reward that was passed in as an argument...
                Set rewardSet = rewardsMap.keySet();
                if(rewardSet.contains(name)) { //if the map of <string, int > contains a key named one of the resource names
                    //add to player resources here. We have validated that the resource is a valid resource.
                    //i spent like 3 hours trying to think of how to do this i will be sad if we scrap this code
                }
            }
        });


    }

    /*
    * "Turn" the page, do whatever operations need to happen after the player has finished this part of the story.
    * @returns True or false based on whether or not it was a valid call
    */
    public void turn(boolean temp){

    }
}
