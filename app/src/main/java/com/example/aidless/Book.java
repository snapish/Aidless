package com.example.aidless;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Book {
    public String bookName;
    public String bookDisplayName;
    public int numberOfChapters;
    public Map<Chapter, ArrayList<Page>> chapters;
    public int numberOfEndings;

    /*
    * Creates a default book object with all barebones dummy data
    */
    public Book(Chapter chapter){
        this.bookName = "testName";
        this.bookDisplayName = "test name";
        this.numberOfChapters = 1;
        this.chapters = new HashMap<Chapter, ArrayList<Page>>();
        this.numberOfEndings = 1;
    }
}
