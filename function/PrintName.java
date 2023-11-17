package function;

import java.util.Scanner;

public class PrintName {

  public static void printName(String fName, String lName) {
    System.out.println("Frist Name:" + fName + " " + "Last Name:" + lName);
    return;
  }

  public static void main(String[] args) {
    try (Scanner SC = new Scanner(System.in)) {
      String fname = SC.next();
      String lname = SC.next();
      printName(fname, lname);
    }
  }
}
