package function;

import java.util.Scanner;

public class GraterNum {

  public static int graterNum(int a, int b) {
    if (a > b) {
      System.out.println(a + "Grater Number " + b);
      return a;
    } else {
      return b;
    }
  }

  public static void main(String[] args) {
    Scanner SC = new Scanner(System.in);
    int a = SC.nextInt();
    int b = SC.nextInt();
    int grate = graterNum(a, b);
    System.out.println(grate);
  }
}
