import java.util.Scanner;

public class IfCondition {

  public static void main(String[] args) {
    Scanner SC = new Scanner(System.in);
    int a = SC.nextInt();
    int operator = SC.nextInt();
    int b = SC.nextInt();

    /**
     * 1 -> +
     * 2 -> -
     * 3 -> *
     * 4 -> /
     * 5 -> %
     */

    switch (operator) {
      case 1:
        System.out.println(a + b);
        break;
      case 2:
        System.out.println(a - b);
        break;
      case 3:
        System.out.println(a * b);
        break;
      case 4:
        if (b == 0) {
          System.out.println("Invalid Division");
        } else {
          System.out.println(a / b);
        }
        break;
      case 5:
        if (b == 0) {
          System.out.println("Invalid Modules");
        } else {
          System.out.println(a % b);
        }
        break;
      default:
        System.out.println("Invalid Operation ");
    }
  }
}
