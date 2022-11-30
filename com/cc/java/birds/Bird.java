package com.cc.java.birds;

import com.cc.java.interfaces.Flyable;
import com.cc.java.interfaces.IFeathers;

public class Bird implements Flyable, IFeathers{

    @Override
    public String hasFeathers() {
        return "I'm a Bird, I have feathers!";
    }

    @Override
    public String fly() {
        return "I can fly fast!";
    }


    
}
