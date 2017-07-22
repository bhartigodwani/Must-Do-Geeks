/*	
Rightmost different bit
Given two numbers M and N. Write a program to find the position of rightmost different bit in binary representation of numbers.

Input:
First line of input contains a single integer T which denotes the number of test cases. T test cases follows. First line of 
each test case contains two space separated integers M and N.

Output:
For each test case print the position of rightmost different bit in binary representation of numbers. If both M and N are same 
then print -1 in this case.

Example:
Input:
2
11 9
52 4
Output:
2
5
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class BM2 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int t=0; t<test; t++){
    		int x = sc.nextInt();
    		int y = sc.nextInt();
    		int xor = x ^ y;
    		for(int i=0; i<32; i++){
    		    if(((xor >> i) & 1) == 1){
    		        System.out.println(i+1);
    		        break;
    		    }
    		}
		}
	}
}
