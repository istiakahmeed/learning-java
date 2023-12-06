package recursion;

/**
 * Permutations
 */
public class Permutations {

  public static void printPermu(String str, int idx, String prem) {
    if (str.length() == 0) {
      System.out.println(prem);
      return;
    }
    for (int i = 0; i < str.length(); i++) {
      char currChar = str.charAt(i);
      String newStr = str.substring(0, i) + str.substring(i + 1);
      printPermu(newStr, idx + 1, prem + currChar);
    }
  }

  public static void main(String[] args) {
    String str = "abc";
    printPermu(str, 0, "");
  }
}
