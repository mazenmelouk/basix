/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package datastructures.sorting;

/**
 *
 * @author Mazen
 */
public  class Sort {
  public static void swap(int[] array, int i, int j) {
    array[i] += array[j];
    array[j] = array[i] - array[j];
    array[i] = array[i] - array[j];
  }
  
}
