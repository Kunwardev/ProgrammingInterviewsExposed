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
public class PermutationsOfString
{
    private void function(char[] a, int i, int j){
        if(i == j){
            for(char p: a)
                System.out.print(p);
            System.out.println();
            return;
        }
        for(int p=i;p<j;p++){
            char l = a[p];
            a[p] = a[i];
            a[i] = l;
            function(a, i+1, j);
            l = a[p];
            a[p] = a[i];
            a[i] = l;
        }
    }
    
    public static void main(String[] args)
    {
        String a = "ABC";
        PermutationsOfString p = new PermutationsOfString();
        p.function(a.toCharArray(), 0, a.length());
    }
    
}
