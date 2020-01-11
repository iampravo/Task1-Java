package com.jetbrains.Task1;

public class Child extends Parent{

    //Method overloading
    //Method 1 with 2 arguments i.e first is string and second is integer
    public void display(String name,int id){
        System.out.println("Data is as follows : Name = " +name+ " , Id = " +id);
    }
    //Method 2 with 2 arguments . Here the order of the arguments amd data type of the arguments is different
    //than that of Method 1
    public void display(int id, String name){
        System.out.println("Data is as follows : Id = " +id+ " , Name = " +name);
    }
    //Method 3 with 3 arguments i.e first is integer , second and third are string
    public void display(int id , String name , String hobby){
        System.out.println("Data is as follows : Id = " +id+ " , Name = " +name + " , Hobby = " +hobby);
    }
    //Overrriding parent class method i.e show Data
    @Override
    public void showData()
    {
        System.out.println("Inside subclass method");

    }

    public static void main(String[] args) {
        Child child = new Child();
        child.display("Rachel",1);
        child.display(2,"Phoebe");
        child.display(3,"Monica","Cooking");
        child.showData();
        //Creating an object of super class i.e Parent : Inheritance
        Parent parent = new Parent();
        //Invoking the parent class method
        parent.display();
    }
}
