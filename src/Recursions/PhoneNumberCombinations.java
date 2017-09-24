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
public class PhoneNumberCombinations
{
    private void initialize(String x){
        String[] a = new String[]{"000","111","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
        char[] result = new char[7];
        findPermute(a, x, 0, result);
    }

    private void findPermute(String[] a, String x, int level, char[] result)
    {
        if(level == x.length()){
            for(char p: result)
                System.out.print(p);
            System.out.println();
            return;
        }
        for(int i=0;i<a[x.charAt(level)-'0'].length();i++){
            result[level] = a[x.charAt(level)-'0'].charAt(i);
            findPermute(a, x, level+1, result);
        }
    }
    
    public static void main(String[] args)
    {
        String x = "4971927";
        PhoneNumberCombinations p = new PhoneNumberCombinations();
        p.initialize(x);
    }
    
}
