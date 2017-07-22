/*
	
Toggle bits given range

Given a non-negative number N and two values L and R. The problem is to toggle the bits in the range L to R in the binary 
representation of N, i.e, to toggle bits from the rightmost Lth bit to the rightmost Rth bit. A toggle operation flips a bit
0 to 1 and a bit 1 to 0.

Input:
First line of input contains a single integer T which denotes the number of test cases. Then T test cases follows. First line
of each test case contains three space separated integers N, L and R.

Output:
For each test case , print the number obtained by toggling bits from the rightmost Lth bit to the rightmost Rth bit in binary
representation of N.

Example:
Input:
2
17 2 3
50 2 5
Output:
23
44
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class BM4 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int t=0; t<test; t++){
    		int n = sc.nextInt();
    		int l = sc.nextInt();
    		int r = sc.nextInt();
    		int temp = 1 << (l-1);
    		for(int i=l; i<r; i++){
    		    temp = temp | (temp<<1);
    		}
    		n = n ^ temp;
    		System.out.println(n);
		}
	}
}
