/*
Given an integer an N, write a program to print the position of first set bit found from right side in the binary 
representation of the number.

Input:
The first line of the input contains an integer T, denoting the number of test cases. Then T test cases follow. The only 
line of the each test case contains an integer N.

Output:
For each test case print in a single line an integer denoting the position of the first set bit found form right side of the 
binary representation of the number.

Example:
Input:
2
18
12

Output:
2
3
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class BM {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int test = sc.nextInt();
	    for(int t=0; t<test; t++){
    	    int n = sc.nextInt();
    	    n = n & (~n+1);
    	    int flag = 0;
    	    for(int i=0; i<32; i++){
    	        if(n>>i == 1){
    	            System.out.println(i+1);
    	            flag = 1;
    	            break;
    	        }
    	    }
    	    if(flag == 0)
    	        System.out.println("0");
	    }
	}
}
