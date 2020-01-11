package com.jetbrains.Task1;

public class Child1 extends Parent1 implements ParentInterface {

    public static void main(String[] args) {
        Child1 child1 = new Child1();

        //Accessing Parent Class methods
        child1.displayfinal();
        child1.displaynonstatic();
        child1.displayprotected();
        child1.displaydefault();
        child1.displaystatic();
        /*"Cannot find method error is thrown. This is because private methods are accessible only within a class
        child1.displayprivate();*/

        // Accessing Parent Class variables
        System.out.println(Parent1.s1); //accessing static variable
        System.out.println(child1.s2); //accessing non static variable
        System.out.println(child1.s3);//accessing final variable
        /*//"s4 has private access in Parent1 class" Error is thrown
        System.out.println(child1.s4);*/





    }
}
