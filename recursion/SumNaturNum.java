package recursion;

public class SumNaturNum {

  public static void printSum(int n, int sum) {
    if (n == 11) {
      System.out.println(sum);
      return;
    }
    System.out.println(n);
    sum += n;
    printSum(n + 1, sum);
  }

  public static void main(String[] args) {
    printSum(1, 0);
  }
}
