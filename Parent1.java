package com.jetbrains.Task1;

public class Parent1 implements ParentInterface{

    public static String s1 = "Static Variable";
    String s2 = "Non Static Variable";
    final String s3 = "Final Variable";
    private String s4 ="Private Variable";

    public static void displaystatic()
    {
        System.out.println("Inside Static method");
    }
    public void displaynonstatic()
    {

        System.out.println("Inside non static method");
    }
    public final void  displayfinal()
    {

        System.out.println("Inside Final method");
    }
    private void displayprivate()
    {

        System.out.println("Inside Private method");
    }

    protected void displayprotected()
    {

        System.out.println("Inside protected method");
    }

    public static void main(String[] args) {

        //Testing method accessibility from same class
        Parent1 parent1 = new Parent1();
        parent1.displaystatic();
        parent1.displaynonstatic();
        parent1.displayfinal();
        parent1.displayprivate();
        parent1.displayprotected();
        parent1.displaydefault();

        //Testing variable accessibility from same class
        //static variable is accessed by using class name
        System.out.println(Parent1.s1);
        //"Non static fields cannot be referenced from static context" Error is thrown
        //Parent1.s2;
        System.out.println(parent1.s2); //accesing non static variable
        System.out.println(parent1.s3); //accessing final variable
        System.out.println(parent1.s4); //accessing private variable


    }


}
