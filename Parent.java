package com.jetbrains.Task1;


public class Parent {
    int id;
    String name;
    String city;

    //No argument constructor
   public Parent()
   {
       System.out.println("Inside Default constructor");
       this.id=1;
        this.name="Ross";
        this.city="New York";
   }
   //Parameterized constructor
   public Parent(int id,String name)
   {
       System.out.println("Inside parameterized constructor 1");
       this.id = id;
       this.name = name;
       this.city="Michigan";
   }
   public Parent(int id,String name,String city)
   {
       //Invoking the parameterized constructor with 2 arguments --> Constructor Chaining
       this(id,name);
       System.out.println("Inside parameterized constructor 2 with 3 arguments");
       this.city=city;



   }
   //Display method to display the data
   public void display()
   {
       System.out.println("Data is as follows : id = " + id + " , name = " +name + " , city = " + city);
   }
   public void showData()
   {
       System.out.println("Inside Super class method");
   }

    public static void main(String[] args) {
       //Constructor overloading
        //calling no argument constructor
        Parent object1 = new Parent();
        object1.display();
        //calling parameterized constructor by passing id and name
        Parent object2 = new Parent(2,"Joey");
        object2.display();
        //calling parameterized constructor by passing id, name and city
        Parent object3 = new Parent(3,"Chandler","Los Angeles");
        object3.display();
   }
}
