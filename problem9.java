// Print the pattern for n=5
/*          [space,star,space]
    *       [4,1,4] 
   ***      [3,3,3]
  *****     [2,5,2]
 *******    [1,7,1]
*********   [0,9,0]
*********   [0,9,0]
 *******    [1,7,1]
  *****     [2,5,2]
   ***      [3,3,3]
    *       [4,1,4]
 */

 import java.util.*;
 
 public class problem9 {
     public static void print7(int n) {
         for(int i= 0; i < n ; i++) {
            //space 
            for(int j = 0;j<n-i-1;j++){
                System.out.print(" ");
            }
         //star
            for(int j = 0;j<2*i+1;j++) {
                System.out.print("*");
            }
         //space
         for(int j = 0;j<n-i-1;j++) {
            System.out.print(" ");
        }System.out.println();
      }
    }
    public static void print8(int n) {
        for(int i= 0; i < n ; i++) {
           //space 
           for(int j = 0;j<i;j++){
               System.out.print(" ");
           }
        //star
           for(int j = 0;j<2*n-(2*i+1);j++) {
               System.out.print("*");
           }
        //space
        for(int j = 0;j<i;j++) {
           System.out.print(" ");
       }System.out.println();
     }
   }
     public static void main(String args[]){
         Scanner sc = new Scanner (System.in);
         int n = sc.nextInt();
         print7(n);
         print8(n);
         sc.close();
     }
 }