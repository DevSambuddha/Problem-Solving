// Print the pattern for n=5
/*          
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
 */

 import java.util.*;
 
 public class problem20 {
     public static void print20(int n) {
        int spaces = 2*n - 2;
         for(int i = 1;i<=2*n-1;i++) {
            int stars = i;
            //star
            if(i>n) stars=2*n-i;
            for (int j=1;j<=stars;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=spaces;j++){
                System.err.print(" ");
            }
            //star
            for (int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
            if (i<n) spaces -= 2;
            else spaces += 2;
            }
         }
    
     public static void main(String args[]){
         Scanner sc = new Scanner (System.in);
         int n = sc.nextInt();
         print20(n);
         sc.close();
     }
 }