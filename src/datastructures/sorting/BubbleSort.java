/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package datastructures.sorting;

import java.util.Arrays;

/**
 *
 * @author Mazen
 */
public class BubbleSort extends Sort{

  public  static void sort(int[] array) {
    for (int i = 0; i < array.length; i++) {
      boolean swapped = false;
      for (int j = 0; j < array.length - 1; j++) {
        if (array[j] > array[j + 1]) {
         swap(array, j, j + 1);
          swapped = true;
        }

      }
      System.out.println(Arrays.toString(array));
      if (!swapped)
        break;
    }
  }

}
