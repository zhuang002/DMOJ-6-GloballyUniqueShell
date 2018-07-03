/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package globallyuniqueshells;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class GloballyUniqueShells {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int noLeft=sc.nextInt();
        int[] rights=new int[sc.nextInt()];
        int count=0;
        for (int i=0;i<rights.length;i++) {
            rights[i]=sc.nextInt();
        }
        Arrays.sort(rights);
        
        for (int i=0;i<noLeft;i++) {
            if (arrayContains(rights,0,rights.length-1,sc.nextInt()))
                count++;
        }
        System.out.println(n-count);
    }

    private static boolean arrayContains(int[] array, int start, int end,int element) {
        if (start>end) return false;
        if (end>=array.length) return false;
        if (start==end) return array[start]==element;
        
        int middle=(start+end)/2;
        if (array[middle]==element) return true;
        else if (array[middle]>element) {
            return arrayContains(array,start,middle-1,element);
        }
        else {
            return arrayContains(array,middle+1,end,element);
        }
        
    }
    
}
