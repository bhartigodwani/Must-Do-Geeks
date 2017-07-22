/*
Alone in couple

In a party everyone is in couple except one. People who are in couple have same numbers. Find out the person who is not in 
couple.

Input:
The first line contains an integer 'T' denoting the total number of test cases. In each test cases, the first line contains 
an integer 'N' denoting the size of array. The second line contains N space-separated integers A1, A2, ..., AN denoting the
elements of the array. (N is always odd)


Output:
In each seperate line print number of the person not in couple.

Example:
Input:
1
5
1 2 3 2 1

Output:
3
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class BM13 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int t=0; t<test; t++){
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    int alone = 0;
		    for(int i=0; i<n; i++){
		        a[i] = sc.nextInt();
		        alone ^= a[i];
		    }
		    System.out.println(xor);
		}
	}
}
