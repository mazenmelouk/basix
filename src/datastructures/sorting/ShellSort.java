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
public class ShellSort extends Sort {

    
    public static int[] sort(int[] array) {
        int interval=1;
        while(interval<array.length/3){
            interval=interval*3+1;
        }
        while(interval>0){
            
            for(int i=interval;i<array.length;i++){
                for(int j=i;j>=interval;j-=interval){
                    if(array[j]<array[j-interval]){
                        swap(array, j-interval, j);
                    }
                }
            }interval/=3;
        }return array;
    }
    
}
