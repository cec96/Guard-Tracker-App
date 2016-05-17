package com.example.conners.guardtracker;

import android.widget.TextView;

import java.io.Serializable;

/**
 * Created by Conners on 2/17/2016.
 */
public class LifeGuard implements Serializable{
   public int position;
    public String name = "";

    public int visited;
    public int breaks;
    public int timeOnStand;

    public LifeGuard(int position, String name,int visited, int breaks, int timeOnStand) {
        super();

        this.name = name;

        this.position = position;

        this.visited = visited;

        this.breaks = breaks;

        this.timeOnStand = timeOnStand;
    }

}



