package com.sdmag.iiuc.com.abstractclassexample;

/**
 * Created by Mehedi on 7/20/2018.
 * mehedipy@gmail.com
 */
public class Main {
    public static void main(String[] args){

        Person employee = new Employee("Abid", "Male", 34);
        Person student = new Employee("Kamruzzaman", "male", 0);

        System.out.println(student.toString());
        student.work();

        System.out.println(employee.toString());
        employee.work();
    }
}
