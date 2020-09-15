package com.test;

public class TowersOfHanoi {
	
	public static void main(String[] args) {
		Hanoi(3, 'A', 'B', 'C' );		
	}
	// Using recursion method
	public static void Hanoi(int n, char from_rod, char to_rod, char aux_rod) {
		
		if(n == 1) {
			System.out.println("Disk 1 moved from " + from_rod + " to " + to_rod );
			return;
		} 
		
		Hanoi(n-1, from_rod, aux_rod, to_rod);
		System.out.println("Move disk " + n + " from rod " +  from_rod + " to rod " + to_rod);
		Hanoi(n-1, aux_rod, to_rod, from_rod);
	}
}
