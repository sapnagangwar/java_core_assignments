package com.javaCore.loop2Assignment;

import java.util.Scanner;

/**
 * display a pattern 
 */
public class Exercise5{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter number of lines in display required: "); 
		int noOfLines=sc.nextInt();
		display(noOfLines);
		sc.close();
	}

	public static void display(int n){
		int k = n-1;
		for(int i=1; i<=n;i++){
			for(int j=1;j<=k;j++){
				System.out.print(" ");
			}
			k=k-1;
			for(int j=1;j<=2*i-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=3; i++){
			for (int j=1;j<=6;j++){
				System.out.print(" ");
			}
			for(int w =1;w<=3;w++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*RUN RESULTS:
 enter number of lines in display required: 8
  	   *
      ***
     *****
    *******
   *********
  ***********
 *************
***************
      ***
      ***
      ***

 */