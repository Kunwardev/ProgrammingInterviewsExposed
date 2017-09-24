/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Recursions;

/**
 *
 * @author Kunwar
 */
public class BinarySearch
{
    
    private int function(int[] arr, int k){
        int start = 0, end = arr.length-1;
        return functionUtil(arr, start, end, k);
    }

    private int functionUtil(int[] arr, int start, int end, int k)
    {
        if(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == k)
                return mid;
            else if(arr[mid] > k){
                return functionUtil(arr, start, mid-1, k);
            }else{
                return functionUtil(arr, mid+1, end, k);
            }
        }
        return -1;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,4,6,8,9,11,14,20};
        BinarySearch b = new BinarySearch();
        System.out.println(b.function(arr, 25));
    }
    
}
