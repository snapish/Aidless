package com.example.aidless;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Book {
    public String bookName;
    public int numberOfChapters;
    public int numberOfPages;
    public Map<Chapter, ArrayList<Page>> chapters;
    public int numberOfEndings;

    /*
    * Creates a default book object with all barebones dummy data
    */
    public Book(){
        this.bookName = "test name";
        this.numberOfChapters = 1;
        this.numberOfPages = 1;
        ArrayList<Page> temp = new ArrayList<Page>();
        temp.add(new Page());
        this.chapters = new HashMap<Chapter, ArrayList<Page>>();
        this.chapters.put(new Chapter(), temp);
        this.numberOfEndings = 1;
    }
}
