package com.api;

public class Person {

    public int age=10;
    public void sayHallo(){
        System.out.println("Hello");
    }
     public  void  sayMyName(){
        System.out.println(               "name");
   }


    public int getSalary(){
        return 200;
    }

    public  boolean isAdult(int age ){
        return age > 18;
    }
    public String fname = "John", sname ="Snow";



    public Person() {
    }
    public Person(int age, String fname, String sname) {
        this.age = age;
        this.fname = fname;
        this.sname = sname;
    }
}
