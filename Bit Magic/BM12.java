/*	
Number is sparse or not
Given a number, check whether it is sparse or not. A number is said to be a sparse number if in binary representation of the 
number no two or more consecutive bits are set.

Input:
The first line of input contains an integer T denoting the number of test cases. The first line of each test case is number'N'.

Output:
Print '1' if the number is sparse and '0' if the number is not sparse.

Example:
Input:
4
72
12
2
3

Output:
1
0
1
0
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class BM12 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int t=test; t>=1; t--){
		    int n = sc.nextInt();
		    int flag = 0;
		    int log = (int)(Math.log(n)/Math.log(2));
		    for(int i=0; i<=log; i++){
		        int t1 = ((n>>(i)) & 1);
    		    int t2 = ((n>>(i+1)) & 1);
    		    if((t1 == 1 && t2 == 1)){
	    	        System.out.println("0");
		            flag = 1;
		            break;
		        }
		    }
    		if(flag == 0)
    		    System.out.println("1");
		}
	}
}
