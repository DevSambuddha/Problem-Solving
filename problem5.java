// Print the pattern for n=5
/*
* * * * * * 
* * * * * 
* * * * 
* * * 
* * 
* 
 */

 import java.util.*;
 
 public class problem5 {
     public static void print5(int n) {
         for(int i=0;i<=n;i++){
             for(int j=1;j<=n-i+1;j++) {  //(n-row+1)
                 System.out.print("* ");
             }System.out.println();
         }
     }
     public static void main(String args[]){
         Scanner sc = new Scanner (System.in);
         int n = sc.nextInt();
         print5(n);
         sc.close();
     }
 }