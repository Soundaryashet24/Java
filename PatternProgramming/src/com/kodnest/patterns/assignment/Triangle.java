package com.kodnest.patterns.assignment;

public class Triangle {
public static void main(String[] args) {
	for(int i=1;i<=3;i++) {
		for(int j=1;j<=5;j++) {
			if(i==3 || j==3 && i!=2 || i==2 && j%2==0 ) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
