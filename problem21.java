// Print the pattern for n=5
/*          
*****
*   *
*   *
*   *
*****
 */

 import java.util.*;
 
 public class problem21 {
     public static void print21(int n) {
        for (int i=0;i<n;i++) {
                for(int j=0;j<n;j++) {
                if( i == 0 || j == 0 || i == n-1 || j == n-1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }System.out.println();
        }
        }
    
     public static void main(String args[]){
         Scanner sc = new Scanner (System.in);
         int n = sc.nextInt();
         print21(n);
         sc.close();
     }
 }