package com.example.aidless;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Page {
    public String name;
    public String objective; //something like "obtain x amount of resource Y" , or spend X time doing something w\e the goal is
    public Map<Resource, Integer> resourceReward;
    public ArrayList<Resource> resourceRewardArray; //a list of resources that are involved in the chapter maybe? TODO NOT FINAL ON WHETHER OR NOT I WANNA KEEP/USE THIS


    /*
     * Creates a default page object with all barebones dummy data
     */
    public Page(){
        this.name = "test name";
        this.objective = "test objective";
        this.resourceReward = new HashMap<Resource, Integer>();
        this.resourceReward.put(new Resource(), 1);
        this.resourceRewardArray.add(new Resource());

    }

    /*
    * Takes any number of Resource and Integer maps that will validate and then give the player a reward
    * TODO ADD SOME OPERATION TO MOVE THE PLAYER TO THE NEXT PAGE IN THE CHAPTER
    */
    public void endingReward(Map<Resource, Integer>... rew){
        for (Map<Resource, Integer> reward :  rew ) {
        System.out.println(reward.entrySet().iterator().next());
        System.out.println(reward);

            //if(this.resourceRewardArray.contains(reward.entrySet().iterator().next()))
        }
    }

    /*
    * "Turn" the page, do whatever operations need to happen after the player has finished this part of the story.
    * @returns True or false based on whether or not it was a valid call
    */
    public boolean turn(boolean temp){
        if(temp == true){
            return true;
        }
        return false;
    }
}
