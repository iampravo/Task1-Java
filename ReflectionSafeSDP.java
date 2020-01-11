package com.jetbrains.Task1;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class ReflectionSafeSDP implements Serializable,Cloneable{
    //Creating SingleTonDesignPattern using Reflection Safe Approach

    //private static Class instance
    private static ReflectionSafeSDP INSTANCE;

    //private Constructor
    private ReflectionSafeSDP(){
        System.out.println("Singleton Design pattern using Reflection safe approach");
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
    public static ReflectionSafeSDP getInstance()
    {
        if(null ==  INSTANCE) {
            try {
                INSTANCE = (ReflectionSafeSDP) Class.forName("com.jetbrains.Task1.ReflectionSafeSDP").newInstance();
                System.out.println("Creating new Instance");
            } catch (Exception e) {
                System.out.println(e.getStackTrace());
            }
        }
        return INSTANCE;
    }

    //display method to display relevant message
    public void display(){
        System.out.println("Inside Display method");
    }
    //Creating a public static method  which will return the same instance every time
    public static void main(String[] args) {
        ReflectionSafeSDP.getInstance().display();
        ReflectionSafeSDP.getInstance().display();
        ReflectionSafeSDP.getInstance().display();
    }

}
