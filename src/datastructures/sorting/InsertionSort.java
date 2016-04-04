/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package datastructures.sorting;

/**
 *
 * @author Mazen
 */
public class InsertionSort {

  public static void sort(int[] array) {
    for (int i = 1; i < array.length; i++) {
      for (int j = i; j > 0; j--) {
        if (array[j] < array[j - 1]) {
          Sort.swap(array, j, j - 1);
        }
      }
    }
  }

}
