// Print the pattern for n=5
/*
1 2 3 4 5 6 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
 */

 import java.util.*;
 
 public class problem6 {
     public static void print6(int n) {
         for(int i=0;i<=n;i++){
             for(int j=1;j<=n-i+1;j++) {  //(n-row+1)
                 System.out.print(j+" ");
             }System.out.println();
         }
     }
     public static void main(String args[]){
         Scanner sc = new Scanner (System.in);
         int n = sc.nextInt();
         print6(n);
         sc.close();
     }
 }