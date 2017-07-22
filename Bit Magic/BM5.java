/*
Set kth bit
Given a number N and a value K. From the right, set the Kth bit in the binary representation of N. The position of LSB(or 
last bit) is 0, second last bit is 1 and so on. Also, 0 <= K < X, where X is the number of bits in the binary representation 
of N.

Input:
First line of input contains a single integer T which denotes the number of test cases. T test cases follows. First line of 
each test case contains two space separated integers N and K.

Output:
For each test case, print the new number after setting the Kth bit of N.

Example:
Input:
2
10 2
15 3
Output:
14
15
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class BM5 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int t=0; t<test; t++){
    		int n = sc.nextInt();
    		int k = sc.nextInt();
    		n = n | (1<<k);
    		System.out.println(n);
		}
	}
}
