// Print the pattern
/*

 */

 import java.util.*;
 
 public class problem4 {
     public static void print4(int n) {
         for(int i=0;i<=n;i++){
             for(int j=1;j<=i;j++) {
                 System.out.print(i+" ");
             }System.out.println();
         }
     }
     public static void main(String args[]){
         Scanner sc = new Scanner (System.in);
         int n = sc.nextInt();
         print4(n);
         sc.close();
     }
 }