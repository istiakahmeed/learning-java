package function;

import java.util.Scanner;

public class AvarageNum {

  public static void main(String[] args) {
    try (Scanner SC = new Scanner(System.in)) {
      int a = SC.nextInt();
      int b = SC.nextInt();
      int c = SC.nextInt();
      int avg = (a + b + c) / 3;
      System.out.println(avg);
    }
  }
}
