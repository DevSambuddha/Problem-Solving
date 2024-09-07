// Print the pattern for n=5
/*          [space,star,space]
    *       [4,1,4] 
   ***      [3,3,3]
  *****     [2,5,2]
 *******    [1,7,1]
*********   [0,9,0]
 */

 import java.util.*;
 
 public class problem7 {
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
     public static void main(String args[]){
         Scanner sc = new Scanner (System.in);
         int n = sc.nextInt();
         print7(n);
         sc.close();
     }
 }