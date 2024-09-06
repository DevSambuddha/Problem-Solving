//Print the pattern for n=5
/* 
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 
*/

import java.util.*;

public class problem2 {

    public static void print2(int n){
        for (int i=0;i<=n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        print2(n);
        sc.close();
    }
}