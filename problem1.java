/*Print the pattern
* * * * 
* * * * 
* * * * 
* * * * 
*/

import java.util.*;

public class problem1 {
    public static void print1(int n){
        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print1(n);
        sc.close();
    }
}

