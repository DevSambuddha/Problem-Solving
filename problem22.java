// Print the pattern for n=5
/*          
*****
*   *
*   *
*   *
*****
 */

 import java.util.*;
 import static java.lang.Math.min; // Import the min function
 
 public class problem22 {
     public static void print22(int n) {
        for (int i=0;i<2*n-1;i++) {
                for(int j=0;j<2*n-1;j++) {
                int top = i;
                int left = j;
                int right = (2*n-2)-j;
                int down = (2*n-2)-i; 
                System.out.print(n - min(min(top,down), min(left,right)));//revise here
            }System.out.println();
        }
        }
    
     public static void main(String args[]){
         Scanner sc = new Scanner (System.in);
         int n = sc.nextInt();
         print22(n);
         sc.close();
     }
 }
