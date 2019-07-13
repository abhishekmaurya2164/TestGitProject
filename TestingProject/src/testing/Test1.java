package testing;

import java .util.Scanner;
public class Test1{

	/*
		1
		2 6
		3 7 10
		4 8 11 13
		5 9 12 14 15
	*/


	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		for (int i=1;i<=r ;i++ ) {
			int num=i;
			for (int j=1;j<=i ;j++) {
				System.out.print(num+" ");
				num=num+r-j;
			}
			System.out.println();

		}
		System.out.println(5-5*5+5);
	}
}