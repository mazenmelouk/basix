/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package datastructures.search;

/**
 *
 * @author Mazen
 */
public class BinarySearch {

  private BinarySearch() {}

  public static boolean binarySearch(int[] array, int value) {

    return searchRecursive(array, value, 0, array.length - 1) == searchIterative(array, value);

  }

  private static int searchRecursive(int[] array, int value, int st, int end) {
    if (st >= end) {
      return -1;
    }
    int mid = (st + end) / 2;
    if (array[mid] == value) {
      return mid;
    }
    if (array[mid] < value) {
      return searchRecursive(array, value, mid + 1, end);
    } else {
      return searchRecursive(array, value, st, mid - 1);
    }
  }

  private static int searchIterative(int[] array, int value) {
    int st = 0;
    int end = array.length - 1;

    while (end >= st) {
      int mid = (st + end) / 2;
      if (array[mid] == value) {
        return mid;
      }
      if (array[mid] > value) {
        end = mid - 1;
      } else {
        st = mid + 1;
      }
    }
    return -1;
  }

}
