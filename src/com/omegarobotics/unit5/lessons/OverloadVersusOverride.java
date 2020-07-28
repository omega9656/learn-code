package com.omegarobotics.unit5.lessons;

/*
Topics:
- Overloading vs overriding

Overridden methods are in DIFFERENT classes related by inheritance
Overloaded methods can either be in the SAME class OR DIFFERENT classes related by inheritance

Overridden methods have the same signature and return type
Overloaded methods have the same name but different parameter list
- Override annotation
 */

public class OverloadVersusOverride {

    public static void main(String[] args) {
        A a = new A();
        a.p(10);
        a.p(10.0);
    }
}

class B {

    public void p(double i) {
        System.out.println(i * 2);
    }
}

class A extends B {

    // this method OVERRIDES the method in B
    @Override // override annotation prevents errors - error at compile if the method doesn't override anything
    public void p(double i) { // notice the same method signature
        System.out.println(i);
    }
}
//class B {
//    public void p(double i) {
//        System.out.println(i * 2);
//    }
//}
//
//class A extends B {
//    // this method OVERLOADS the method in B
//    public void p(int i) { // notice the different method signature
//        System.out.println(i);
//    }
//}
