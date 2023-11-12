public class ForLoop {

  static int sum = 0;

  public static void main(String[] args) {
    int n = 25;
    for (int i = 1; i < n; i++) {
      if (i % 2 == 1) { // 1 => odd, 0 => even
        System.out.println(i);
      }
    }
    // Sum n number

    // int sum = 0;
    // for (int i = 0; i <= n; i++) {
    //   sum = sum + i;
    //   System.out.println(sum);
    // }
    // System.out.println("result = " + sum);
  }
}
