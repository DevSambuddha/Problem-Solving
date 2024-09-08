//Print the Pattern n = 5
/* [numbers,space,numbers]
1        1
12      21
123    321
1234  4321
1234554321
 */
import java.util.*;
 
 public class problem12 {
     public static void print12(int n) {
        int space = 2*(n-1); 
        for(int i=1;i<=n;i++){
            //numbers
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            //spaces
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //numbers
            for(int j = i;j>=1;j--) {
                System.out.print(j);
            }
            System.out.println();
            space -=2;
         }
    }
    
     public static void main(String args[]){
         Scanner sc = new Scanner (System.in);
         int n = sc.nextInt();
         print12(n);
         sc.close();
     }
 }