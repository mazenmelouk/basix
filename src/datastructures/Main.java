/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package datastructures;

import datastructures.sorting.QuickSort;
import datastructures.sorting.ShellSort;
import java.util.Arrays;

/**
 *
 * @author Mazen
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
      int x=3;
      int y=5;
      x+=y;
      y=x-y;
      x=x-y;
      System.out.println(x+" "+y);
    System.out.println(2 & 1);
    int[] arr = {7, 8,0,9,12, 5, 1, 4, 3, 2};
    System.out.println(Arrays.toString(arr));
    QuickSort.sort(arr);
    System.out.println(Arrays.toString(arr));

  }

}
