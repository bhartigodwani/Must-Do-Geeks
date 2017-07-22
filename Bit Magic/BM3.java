/*
Check whether K-th bit is set or not

Given a number  N and  a bit number K, check if K-th bit of N is set or not. A bit is called set if it is 1. Position of 
set bit '1' should be indexed starting with 0 from LSB side in binary representation of the number. For example, for 
N = 4(100), 0th bit = 0, 1st bit = 0, 2nd bit = 1.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case 
consists of two lines. The first line of each test case contain an integer  N. The second line of each test case contains a
n integer  K.
Output:
Corresponding to each test case, print "Yes" (without quotes) if K-th  bit is set else print "No" (without quotes) in a new 
line.

Example:
Input
3
4 0
4 2
500 3

Output
No
Yes
No
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class BM3 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int t=0; t<test; t++){
    		int n = sc.nextInt();
    		int k = sc.nextInt();
    		if(((n >> k) & 1) == 1)
    		   System.out.println("Yes");
    		else
    		    System.out.println("No");
		}
	}
}
