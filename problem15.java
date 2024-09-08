//Print the Pattern n = 5
/* 
A B C D E 
A B C D 
A B C 
A B
A
 */
import java.util.*;
 
 public class problem15 {
     public static void print15(int n) {
         for(int i=0;i<=n;i++){
            // i=2
            for(char ch ='A';ch<='A'+(n-i-1);ch++) {
                System.out.print(ch+" ");
            }System.out.println();
        } 
    }
    
     public static void main(String args[]){
         Scanner sc = new Scanner (System.in);
         int n = sc.nextInt();
         print15(n);
         sc.close();
     }
 }