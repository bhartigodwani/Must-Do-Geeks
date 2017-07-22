/*
	
Bit Difference
 
You are given two numbers A and B. Write a program to count number of bits needed to be flipped to convert A to B.

Input:

The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is a and b.

Output:

Print the number of bits needed to be flipped.

Constraints:

1 ≤ T ≤ 100
1 ≤ a,b ≤ 1000

Example:

Example:
Input
1
10 20

Output
4
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class BM7 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int t=0; t<test; t++){
    		long x = sc.nextLong();
            long y = sc.nextLong();
            long xor = x ^ y;
            long count = 0;
            for(int i=0; i<32; i++){
                if(((xor>>i)&1) == 1)
                    count++;
            }
            System.out.println(count);
		}
	}
}
