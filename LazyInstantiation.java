package com.jetbrains.Task1;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class LazyInstantiation implements Cloneable, Serializable {

    //Singleton Design Pattern where object is created using new Keyword and this is Clone and Serializable safe

    //private static class instance
    private static LazyInstantiation INSTANCE;

    //private Constructor
    private LazyInstantiation(){
        System.out.println("Using lazy Instantiation");
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
    //Using Lazy Instantiation which will check for instance and return same instance if the instance exists or create a new instance
    public static LazyInstantiation getInstance()
    {
        if(null == INSTANCE)
        {
            INSTANCE = new LazyInstantiation();
            System.out.println("Creating an object instance");
        }

        return INSTANCE;
    }

    //display method to display relevant message
    public void display(){
        System.out.println("Inside Display method");
    }

    //main method
    public static void main(String[] args) {
        LazyInstantiation.getInstance().display();
        LazyInstantiation.getInstance().display();
        LazyInstantiation.getInstance().display();
    }

}
