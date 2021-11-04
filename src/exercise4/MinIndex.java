package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MinIndex {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int index = 0;
      int size = input.nextInt();
      float arr[] = new float[size];
      float min = arr[index];
      
      for(int i = 0; i < arr.length; i++) {
        arr [i] = input.nextFloat();

        if (arr[i] <= min) {
          min = arr[i];
          index = i;
        
        }
        
      }
       System.out.print("Min index: " + index);
     
   }

}