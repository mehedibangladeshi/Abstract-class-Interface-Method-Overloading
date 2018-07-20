package com.sdmag.iiuc.com.abstractclassexample;

/**
 * Created by Mehedi on 7/20/2018.
 * mehedipy@gmail.com
 */
public abstract class Person {
//    class member variables
    private String name;
    private String gender;

// constructor method
    public Person(String name, String gender){
        this.name = name;
        this.gender = gender;
    }
// abstract method
    public abstract void work();

//  regular method
    public void changeName(String name ){
        this.name = name;
    }

//    override method
    @Override
    public String toString(){
        return "Name= "+this.name+", Gender= "+this.gender;
    }
}
