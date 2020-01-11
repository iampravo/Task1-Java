package com.jetbrains.Task1;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class ThreadSafeSDP implements Serializable,Cloneable{
    //Creating SingleTonDesignPattern using Thread Safe Approach

    //private static Class instance
    private static ThreadSafeSDP INSTANCE;

    //private Constructor
    private ThreadSafeSDP(){
        System.out.println("Singleton Design pattern using thread safe approach");
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
    public static ThreadSafeSDP getInstance()
    {
        //using double lock checking so that no thread needs to wait
        if(null == INSTANCE)
        {
            //using synchronized block for mulithreaded environment
            synchronized(ThreadSafeSDP.class)
            {
                if(null == INSTANCE)
                {
                    INSTANCE = new ThreadSafeSDP();
                    System.out.println("Creating an object instance");
                }
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
        ThreadSafeSDP.getInstance().display();
        ThreadSafeSDP.getInstance().display();
        ThreadSafeSDP.getInstance().display();
    }

}
