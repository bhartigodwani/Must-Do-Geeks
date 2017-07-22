/*
Longest Consecutive 1's

Given a number N, Your task is to find the  length of the longest consecutive 1's in its binary representation.

Input:
The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. Each test case 
contains an integer N.

Output:
For each test case in a new line print the length of the longest consecutive 1's in N's binary representation.

Example:
Input
2
14
222
Output
3 
4
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int t=0; t<test; t++){
    		int n = sc.nextInt();
    		int l = 0;
    		
    		for(int i=0; i<32; ){
    		    int tempL = 0;
    		    if(((n>>i++) & 1) == 1){
    		        tempL++;
    		        while(((n>>i++) & 1) == 1){
    		            tempL++;
    		        }
    		        if(l < tempL)
    		            l = tempL;
    		    }
    		}
    		System.out.println(l);
		}
	}
}
