// Print the pattern for n=5
/*          [space,character,space]
    A    
   ABA   
  ABCBA  
 ABCDCBA 
ABCDEDCBA  
 */

 import java.util.*;
 
 public class problem17 {
     public static void print17(int n) {
         for(int i= 0; i < n ; i++) {
            //space 
            for(int j = 0;j<n-i-1;j++){
                System.out.print(" ");
            }
         //character
            char ch = 'A';
            int breakpoint = (2*i+1)/2;
            for(int j = 1;j<=2*i+1;j++) {
                System.out.print(ch);
                if (j <= breakpoint) ch++;
                else ch--;
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
         print17(n);
         sc.close();
     }
 }