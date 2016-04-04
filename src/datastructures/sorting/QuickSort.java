/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.sorting;

import java.util.Arrays;

/**
 *
 * @author Mazen
 */
public class QuickSort extends Sort {

    public static void sort(int[] array) {
        partition(array, 0, array.length - 1);
    }

    private static void partition(int[] array, int st, int end) {
        if (st >= end) {
            return;
        }
        int pivotIndex =st + (end - st) / 2;
        int pivot = array[pivotIndex];
        int left = st;
        int right = end;
        while (left < right) {
            while ( array[left] < pivot) {
               
                left++;
            }
            while ( array[right] > pivot) {
             
                right--;
            }
            if (left <= right) {
                int t = array[left];
                array[left] = array[right];
                array[right] = t;
                left++;
                right--;
            }
        }
//        swap(array, left    , end);
//      int t = array[left];
//                array[left] = array[end];
//                array[end] = t;
        if(st<right)partition(array, st, right);
        if(end>left)partition(array, left , end);

    }
}
