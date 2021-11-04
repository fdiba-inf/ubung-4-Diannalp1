package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int size = input.nextInt();
    char ch[] = new char[size];
    for (int i = 0; i < size; i++) {
      ch[i] = input.next(). charAt(0);
    }
    System.out.print("Reversed symbols: [");
    for(int i = size - 1; i >= 0; i--) {
      if (i > 0) {
        System.out.print(ch[i] + ", ");

      } else {
        System.out.print(ch[i]);
      }
    }
    System.out.print("]");

  }

}