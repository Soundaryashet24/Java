package com.kodnest.patterns.level1;

public class Solution6 {
	public static void main(String[] args) {
		//No of lines
		for(int i=1;i<=5;i++) {
			//* should be printed 5 times in each line
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			//Control to bring next line
			System.out.println();
		}
		
	}

}
