package array;

import java.util.Scanner;

public class TwoDarray {

  public static void main(String[] args) {
    Scanner SC = new Scanner(System.in);
    int row = SC.nextInt();
    int cols = SC.nextInt();
    int[][] numbers = new int[row][cols];

    // Input loop
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < cols; j++) {
        numbers[i][j] = SC.nextInt();
      }
    }

    // Output loop
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print(numbers[i][j] + " ");
      }
      System.out.println(); // Move to the next line after each row
    }
  }
}
