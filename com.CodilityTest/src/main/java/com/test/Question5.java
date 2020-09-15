package com.test;

import java.util.Scanner;

public class Question5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 int dollarsValue= 100;
	     int quartesValue= 25;
	     int dimesValue= 10;
	     int nickelsValue= 5;
	     int penniesValue= 1;	
		 int amount;
		 System.out.println("Enter the amount in cents :  ");
		 amount = sc.nextInt();
		
		//2 Dollar 3 quarter 1 dime 3 pennies So smallest possible number of coins equaling the amount 283====9 coins
		
		int dollarCount = 0;
		int qtrCount = 0;
		int  dimeCount = 0;
		int nickelCount = 0;
		int penniesCount;
		int leftCents = 0;
		
		dollarCount = amount/dollarsValue;
		leftCents = amount%dollarsValue;
		qtrCount = leftCents/quartesValue;
		leftCents = leftCents%quartesValue;
		dimeCount = leftCents/dimesValue;
		leftCents = leftCents%dimesValue;
		nickelCount = leftCents/nickelsValue;
		leftCents = leftCents%nickelsValue;
		penniesCount = leftCents/penniesValue;
		
		
		System.out.println("Number of Dollars: " + dollarCount + " Number of qtr: "+ qtrCount + 
				" Number of dimes: " + dimeCount + " Number of nickles : " + nickelCount + " Number of pennies: " + penniesCount);
		System.out.println("Total number of coins : " + (dollarCount+qtrCount+dimeCount+nickelCount+penniesCount));
	}

}
