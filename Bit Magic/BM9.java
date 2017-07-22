/*
Swap all odd and even bits
 
Given an unsigned integer, swap all odd bits with even bits. For example, if the given number is 23 ( 0 0 0 1 0 1 1 1 ), it 
should be converted to 43 ( 0 0 1 0 1 0 1 1 ). Here every even position bit is swapped with adjacent bit on right side (even
position bits are highlighted in binary representation of 23), and every odd position bit is swapped with adjacent on left 
side.

Input:
The first line of input contains an integer T denoting the number of test cases.
Then T test cases follow. The first line of each test case contains an integer N, where N is the number of coins.

Output:
Corresponding to each test case, print in a new line, the converted number .
Example:
Input
2
23
2
Output
43
1
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class BM9 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int t=0; t<test; t++){
    		int n = sc.nextInt();
            String res = "";
            for(int i=0; i<32; i+=2){
                int t1 = (n >> i)&1;
                int t2 = (n >> (i+1))&1;
                res = t1 + "" + t2 + res;
            }
            n = Integer.parseInt(res, 2);
            System.out.println(n);
		}
	}
}
