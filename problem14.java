//Print the Pattern n = 5
/* 
A 
A B 
A B C 
A B C D 
A B C D E
 */
import java.util.*;
 
 public class problem14 {
     public static void print14(int n) {
         for(int i=1;i<=n;i++){
            // i=2
            for(char ch ='A';ch<'A'+i;ch++) {
                System.out.print(ch+" ");
            }System.out.println();
        } 
    }
    
     public static void main(String args[]){
         Scanner sc = new Scanner (System.in);
         int n = sc.nextInt();
         print14(n);
         sc.close();
     }
 }