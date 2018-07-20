package com.sdmag.iiuc.com.abstractclassexample;

/**
 * Created by Mehedi on 7/20/2018.
 * mehedipy@gmail.com
 */
public class Employee extends Person {
//    member variables
    int employeeId;
//    constructor method
    public Employee(String name, String gender, int employeeId) {
        super(name, gender);
        this.employeeId=employeeId;
    }


//    overriding 'work' method from abstract class 'person'
    @Override
    public void work() {
        if (employeeId == 0){
            System.out.println("Not working");
        }else{
            System.out.println("Working as employee");
        }
    }
}
