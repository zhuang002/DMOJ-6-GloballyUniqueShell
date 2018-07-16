    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package globallyuniqueshells;

import java.util.ArrayList;
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
        int noRight=sc.nextInt();
        int noLeft=sc.nextInt();
        ArrayList<Integer> rights=new ArrayList();
        int count=0;
        for (int i=0;i<noRight;i++) {
            rights.add(sc.nextInt());
        }

        for (int i=0;i<noLeft;i++) {
            if (rights.contains(sc.nextInt()))
                count++;
        }
        System.out.println(n-count);
    }
}
