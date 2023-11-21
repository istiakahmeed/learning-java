package string;

public class StringBuilders {

  public static void main(String[] args) {
    // StringBuilder sb = new StringBuilder("tom");
    // // sb.insert(0, 'm'); ==> Insert
    // // sb.charAt(2);
    // // sb.delete(1, 2); ==> Delete
    // // sb.append('i'); ==> new caracter add

    // System.out.println(sb.length());

    // Revers string

    StringBuilder sb = new StringBuilder("Hello");
    sb.reverse();
    System.out.println(sb);
    // for (int i = 0; i < sb.length(); i++) {
    //   int fornt = i;
    //   int back = sb.length() - 1 - i;

    //   char forntChar = sb.charAt(fornt);
    //   char backChar = sb.charAt(back);

    //   sb.setCharAt(fornt, backChar);
    //   sb.setCharAt(back, forntChar);

    //   System.out.println(sb);
    // }
  }
}
