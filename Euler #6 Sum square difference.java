import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long square_sum = (n*(n+1)*(2*n+1))/6;
            long sum_square = ((n*(n+1))/2) * ((n*(n+1))/2);
            long abs_diff = sum_square - square_sum;
            System.out.println(abs_diff);
        }
    }
}
