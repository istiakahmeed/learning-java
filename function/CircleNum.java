package function;

import java.util.Scanner;

public class CircleNum {

  public static Double getCircumference(Double radius) {
    return 2 * 3.14 * radius;
  }

  public static void main(String args[], Double radius) {
    Scanner sc = new Scanner(System.in);
    Double r = sc.nextDouble();

    System.out.println(getCircumference(radius));
  }
}
