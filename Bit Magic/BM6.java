/*
	
Power of 2
Given a positive integer N, check if N is a power of 2.

Input:
The first line contains 'T' denoting the number of test cases. Then follows description of test cases.
Each test case contains a single positive integer N.


Output:
Print "YES" if it is a power of 2 else "NO". (Without the double quotes)


Constraints:
1<=T<=100
0<=N<=10^18

Example:
Input :
2
1
98

Output :
YES
​NO
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class BM6 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int t=0; t<test; t++){
    		long n = sc.nextLong();
            if(n == 0)
                System.out.println("NO");
            else{
        		if((n & (n-1)) == 0)
        		    System.out.println("YES");
        		else
        		    System.out.println("NO");
            }
		}
	}
}
