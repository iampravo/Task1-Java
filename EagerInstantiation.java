package com.jetbrains.Task1;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class EagerInstantiation implements Cloneable, Serializable {

    //Singleton Design Pattern where object is created using new Keyword and this is Clone and Serializable safe

    //private static class instance
    private static EagerInstantiation INSTANCE = new EagerInstantiation();

    //private Constructor
    private EagerInstantiation(){
        System.out.println("Using Eager Instantiation");
    }

    // Overriding readResolve method to suppress creating new object during de-serialization
    private Object readResolve() throws ObjectStreamException {
        return INSTANCE;
    }

    //Overriding the clone method since Class implements Cloneable Interface
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }

    //Creating a public static method  which will return the same instance every time
    //Using Eager Instantiation
    public static EagerInstantiation getInstance()
    {
        return INSTANCE;
    }

    //display method to display relevant message
    public void display(){
        System.out.println("Inside Display method");
    }

    //main method
    public static void main(String[] args) {
        EagerInstantiation.getInstance().display();
        EagerInstantiation.getInstance().display();
        EagerInstantiation.getInstance().display();
    }

}
