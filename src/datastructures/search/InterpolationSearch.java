/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package datastructures.search;

/**
 *
 * @author Mazen
 */
public final class InterpolationSearch {

  private static int recursive(int[] arr, int value, int st, int end) {
    if (arr[st] > value || arr[end] < value) {
      return -1;
    }
    int mid = (int) (st + (((double) (end - st) / (arr[end] - arr[st])) * (value - arr[st])));
    if (arr[mid] == value) {
      return mid;
    }
    if (arr[mid] > value) {
      return recursive(arr, value, st, mid - 1);
    } else {
      return recursive(arr, value, mid + 1, end);
    }

  }

  private InterpolationSearch() {}

  public static int search(int[] arr, int value) {
    return recursive(arr, value, 0, arr.length - 1);
  }
}
