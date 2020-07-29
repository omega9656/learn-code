package com.omegarobotics.unit4.challenges;

/*
Given a 2D double array of xy coordinates,
find the closest pair of points.
Print the coordinates of that pair
and the distance between them.

Hints:
- Create various methods:
public static double distance(double x1, double y1, double x2, double y2)
    Returns the distance between 2 points
public static double[][] findClosestPair(double[][] coordinates)
    Returns a 2D double array containing the 2 closest points
public static void printPair(double[][] pair)
    Prints the 2 closest points and the distance between them in a readable way

Bonus points if you create javadoc comments for each method.
 */

public class FindClosestPair {

    /**
     * Main method
     * Takes coordinates of a bunch of points,
     * finds the closest pair of points,
     * and prints the pair and the distance
     * between them.
     */
    public static void main(String[] args) {
        double[][] coordinates = {
            { -1, 3 },
            { -1, -1 },
            { 1, 1 },
            { 2, 0.5 },
            { 2, -1 },
            { 3, 3 },
            { 4, 2 },
            { 4, -0.5 },
        };
        double[][] closestPair = findClosestPair(coordinates);
        System.out.println("The closest pair is: ");
        printPair(closestPair);
    }

    /**
     * distance method
     * @param x1  first x coordinate
     * @param y1  first y coordinate
     * @param x2  second x coordinate
     * @param y2  second y coordinate
     * @return the distance between the 2 points
     */
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }

    /**
     * Find closest pair of points
     * @param coordinates  a 2D double array with the coordinates of all points
     * @return a 2D double array with the coordinates of the closest pair
     */
    public static double[][] findClosestPair(double[][] coordinates) {
        double shortestDistance = Double.MAX_VALUE;
        double[][] pair = { { 0, 0 }, { 0, 0 } };
        double currentDistance, x1, y1, x2, y2;

        for (int i = 0; i < coordinates.length; i++) {
            x1 = coordinates[i][0];
            y1 = coordinates[i][1];

            for (int j = i + 1; j < coordinates.length; j++) {
                x2 = coordinates[j][0];
                y2 = coordinates[j][1];

                currentDistance = distance(x1, y1, x2, y2);

                if (currentDistance < shortestDistance) {
                    shortestDistance = currentDistance;
                    pair[0][0] = x1;
                    pair[0][1] = y1;
                    pair[1][0] = x2;
                    pair[1][1] = y2;
                }
            }
        }

        return pair;
    }

    /**
     * Prints the 2 points and the distance between them
     * @param pair  a 2D double array with the x and y coordinates of 2 points
     */
    public static void printPair(double[][] pair) {
        // store the coordinates
        double x1 = pair[0][0];
        double y1 = pair[0][1];
        double x2 = pair[1][0];
        double y2 = pair[1][1];

        double distance = distance(x1, y1, x2, y2);

        System.out.printf("(%f, %f) and (%f, %f)\n", x1, y1, x2, y2);
        System.out.println("The distance between those points is " + distance);
    }
}
