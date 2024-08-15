package dsaProblem;

import java.util.Scanner;
/*
Smallest number whose product of digits is N
example = 125
output = 555 [5*5*5=125]
 */

public class SmallestNumberProductOfDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entered Number : ");
        int n ;
        System.out.println("Entered Number : " +(n=sc.nextInt()));
        System.out.print("Product Digits : " +Solution(n));
    }
    public static int Solution(int n)
    {
        String ans ="";
        for(int div=9;div>=2;div--){
            while (n % div == 0){
                n = n/div;
                ans = div+ans;
            }
        }
        if(n!=1){
            return -1;
        }
        else {
            return Integer.parseInt(ans);
        }
    }
}
