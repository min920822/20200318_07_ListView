package com.example.a20200318_07_listview.Datas;

import java.io.Serializable;

public class Store implements Serializable {

    private String name;
    private int rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}


