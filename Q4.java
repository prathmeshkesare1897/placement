package com.placement;
import java.util.*;
public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i = 0,j = 1;
		int result = 0;
		int count = 0;
		while(num > count) {
			System.out.print(i+"+ ");
			result = i + j;
			i = j;
			j = result;
			count++;
	}

}
}