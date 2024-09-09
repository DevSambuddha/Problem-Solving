//Print the pattern for n=4
/* 
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 
*/

import java.util.*;

public class problem18 {

    public static void print18(int n){
        for (int i=0;i<n;i++){
            for (char ch= (char)('E'-i);ch<='E';ch++){
                System.out.print(ch);
            }System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        print18(n);
        sc.close();
    }
}