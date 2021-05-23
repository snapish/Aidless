package com.example.aidless;

import java.util.ArrayList;
import java.util.Map;

public class Player {
    //made the class for writing down ideas of things i wanna store in the players data, this data probably wont stay in this format

    public Book activeBook; //what book the player most recently accessed for something like a resume button
    public ArrayList<Book> ownedBooks; //books the player may access/play, used for something like showing a selection of available to play vs all existing
    public Map<Book,Map<Resource, Long> > resourceData; //bad name, a map for holding all the resources a person owns. Divided by book to get specific to that play through
    public int points; //super bad name, for tracking how many "points" they've gotten from completeing books/chapters TODO: RENAME POINTS
    public int coins; //another really bad name but this would represent mtx tokens they can buy/earn TODO: RENAME COINS

    public Player(){

    }

}
