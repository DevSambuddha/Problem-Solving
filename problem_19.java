//Print the Pattern n = 5
/* [star,space,star]
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
 */
import java.util.*;
 
 public class problem_19 {
     public static void print19(int n) {
        int iniS = 0;
        //Upper Part
        for(int i=1;i<=n;i++){
            //star
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            //spcaes
            
            for(int j=0;j<iniS;j++){
                System.out.print(" ");
            }
            //star
            for(int j =1;j<=n-i+1;j++){
                System.out.print("*");
            }iniS+=2;
            System.out.println();
         }
         
         //Lower Part
         iniS = 2 * (n - 1);
         for(int i=1;i<=n;i++){
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spcaes
            for(int j=0;j<iniS;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }iniS -= 2;
            System.out.println();
         }
    }
    
     public static void main(String args[]){
         Scanner sc = new Scanner (System.in);
         int n = sc.nextInt();
         print19(n);
         sc.close();
     }
 }