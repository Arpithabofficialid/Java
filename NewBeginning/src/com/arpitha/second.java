package com.arpitha;

import java.util.Scanner;

public class second {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two no's");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n = n1 + n2;
		System.out.println(n);
		sc.close();
	}
}
