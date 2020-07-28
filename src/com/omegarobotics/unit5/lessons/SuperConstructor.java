package com.omegarobotics.unit5.lessons;

public class SuperConstructor {

  public static void main(String[] args) {
    // see classes below
  }
}

class ClassName extends SuperClassName {

  public ClassName() {
    // some statements
  }

  /*
    Above is equivalent to below:
    public ClassName() {
        super();
        // some statements
    }
     */

  public ClassName(double d) {
    // some statements
  }
  /*
    Above is equivalent to below:
    public ClassName(double d) {
        super();
        // super(d);
        // some statements
    }
     */
}

class SuperClassName {

  public SuperClassName() {
    // some statements
  }

  public SuperClassName(double d) {
    // some statements
  }
}
