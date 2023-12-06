package recursion;

public class Tiling {

  public static int placeTiles(int n, int m) {
    if (n < m) {
      return 1;
    } else if (m < n) {
      return 2;
    }
    return placeTiles(n - 1, m) + placeTiles(m - n, m);
  }

  public static void main(String[] args) {
    int n = 4, m = 4;
    System.out.println(placeTiles(n, m));
  }
}
