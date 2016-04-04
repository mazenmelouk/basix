/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.sorting;

/**
 *
 * @author Mazen
 */
public class MergeSort {

    public static int[] sort(int[] array) {
        
        return divide(array, 0, array.length - 1);
    }

    private static int[] divide(int[] array, int st, int end) {
        if (st == end) {
           
            return array;
        }
        int mid=(st+end)/2;
        int[] left=divide(array, st, mid);
        int[] right=divide(array, mid+1, end);
        int[] result=new int[left.length+right.length];
        int i=0,j=0,index=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                result[index++]=left[i++];
            }else{
                result[index++]=right[j++];
            }
        }
        while(i<left.length){
            result[index++]=left[i++];
        }while(j<right.length){
            result[index++]=right[j++];
        }
        return result;
    }
}
