package com.omegarobotics.unit2.lessons;

/*
Topics:
- switch
 */

import java.util.Scanner;

public class Switch {

  public static void main(String[] args) {
    // prompt user for a movie or TV show
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a movie or TV show: ");
    String media = input.nextLine();
    input.close();

    // depending on the movie/TV show, print an iconic line
    switch (media) {
      case "Agents of SHIELD":
        System.out.println("Tahiti, it's a magical place.");
        break; // don't forget to break, otherwise it'll cascade!
      case "Star Wars":
        System.out.println("May the Force be with you.");
        break;
      case "Star Trek":
        System.out.println("Live long and prosper.");
        break;
      case "Stranger Things":
        System.out.println("Friends don't lie.");
        break;
      case "Daredevil":
        System.out.println("Darkness only responds to darkness.");
        break;
      default:
        System.out.println("Oops! I don't recognize that movie or TV show.");
    }
  }
}
