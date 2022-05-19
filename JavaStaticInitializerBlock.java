import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        if( a*b > 0 && a > 0){
            System.out.println(a*b);
        }else System.out.println("java.lang.Exception: Breadth and height must be positive")
        ;
    }
}
