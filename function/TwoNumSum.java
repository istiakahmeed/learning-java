package function;

import java.util.Scanner;

public class TwoNumSum {

  public static int calculateSum(int a, int b) {
    int sum = a + b;
    return sum;
  }

  public static void main(String[] args) {
    try (Scanner SC = new Scanner(System.in)) {
      int a = SC.nextInt();
      int b = SC.nextInt();
      int sum = calculateSum(a, b);
      System.out.println(sum);
    }
  }
}
