package string;

class Strings {

  public static void main(String[] args) {
    String firstName = "Tom";
    String lastName = "Ahmed";
    String fullName = firstName + " " + lastName;
    for (int i = 0; i < fullName.length(); i++) {
      System.out.println(fullName.charAt(i));
    }
  }
}
