package com.placement;
import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		System.out.println("enter any no");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("no is "+n);
		Boolean flag=false;
		int i=2;
		while(i<=n/2) {
			if(n%i == 0) {
				flag=true;
				break;
			}
			++i;
		}
		if(!flag) {
			System.out.println(n+" is prime");
		}else {
			System.out.println(n+" is not prime");
		}
	}

}
