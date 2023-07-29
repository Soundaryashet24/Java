package com.kodnest.patterns.alphabetic;

public class Alphabetic1 {
public static void main(String[] args) {
	char ch = 'A';
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(ch);
			
			
		}
		
		System.out.println();
		ch++;
	}
}
}
