package com.omegarobotics.unit5.lessons.geometric;

import com.omegarobotics.unit5.practice.geometric.Rectangle;

/*
Topics:
- Comparing objects' contents (equals method) vs references (==)
- Comparing custom objects (without using Comparable/Comparator)
 */

public class CompareObjects {
    public static void main(String[] args) {
        // another way to initialize strings - using constructor
        String str1 = new String("Hello");
        String str2 = new String("Hello");

        // this won't work as an example because Java automatically
        // points the Strings to the same location in memory
        // String str1 = "Hello";
        // String str2 = "Hello";

        System.out.println("str1 == str2: " + (str1 == str2)); // false because str1 and str2 are stored in different locations in memory
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true

        Circle c1 = new Circle();
        Circle c2 = new Circle();

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        System.out.println("c1 == c2: " + (c1 == c2));
        System.out.println("r1 == r2: " + (r1 == r2));

        System.out.println(c1.equals(c2));
        System.out.println(r1.equals(r2));

        Circle c3 = new Circle(5);
        Circle c4 = new Circle(3.5);

        Rectangle r3 = new Rectangle(2, 36);
        Rectangle r4 = new Rectangle(4, 9);

        System.out.println(compareCircles(c3, c4));
        System.out.println(compareRectangles(r3, r4));
    }

    // OTHER WAYS TO COMPARE OBJECTS:
    // override compareTo() if implements Comparable
    // create a Comparator class that implements compare()

    /**
     * Compares two <code>Circle</code> objects based on their area.
     * @param c1  first <code>Circle</code>
     * @param c2  second <code>Circle</code>
     * @return 1 if c1 > c2 area, -1 if c1 < c2 area, or 0 if c1 == c2 area
     */
    public static int compareCircles(Circle c1, Circle c2) {
        if (c1.getArea() > c2.getArea()) {
            return 1;
        } else if (c1.getArea() < c2.getArea()) {
            return -1;
        } else {
            return 0; // equal
        }
    }

    /**
     * Compares two <code>Rectangle</code> objects based on their area.
     * @param r1  first <code>Rectangle</code>
     * @param r2  second <code>Rectangle</code>
     * @return 1 if c1 > c2 area, -1 if c1 < c2 area, or 0 if c1 == c2 area
     */
    public static int compareRectangles(Rectangle r1, Rectangle r2) {
        if (r1.getArea() > r2.getArea()) {
            return 1;
        } else if (r1.getArea() < r2.getArea()) {
            return -1;
        } else {
            return 0; // equal
        }
    }
}
