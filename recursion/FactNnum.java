package recursion;

public class FactNnum {

  public static void printFactorial(int n, int fact) {
    if (n == 6) {
      System.out.println(fact);
      return;
    }
    System.out.println(n);
    fact = fact * n;
    printFactorial(n + 1, fact);
  }

  public static void main(String[] args) {
    printFactorial(1, 1);
  }
}
