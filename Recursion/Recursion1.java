//Write a java program to find factorial using recursion.
package Recursion;
import java.util.*;
public class Recursion1 {
    public static int FactorialRecursion(int n){
        if(n==0 || n==1){
            return 1;
        } else {
            return n*FactorialRecursion(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        int resultRecursive = FactorialRecursion(num);
        System.out.println("The factorial of "+num+"using recursion is:"+resultRecursive);
    }
}