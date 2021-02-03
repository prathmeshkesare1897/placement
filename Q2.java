package com.placement;
import java.util.*;

public class Q2 {

	public static void main(String[] args) {
		System.out.println("enter no");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n <0) {
			System.out.println("no is negative");
		}else if(n>0){
			System.out.println("no is positive");
			
		}else {
			System.out.println("no is equal to 0");
		}
		
	}

}
