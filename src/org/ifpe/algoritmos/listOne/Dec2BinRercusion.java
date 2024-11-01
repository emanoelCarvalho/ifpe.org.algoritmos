package org.ifpe.algoritmos.listOne;

public class Dec2BinRercusion {
	public static void main(String[] args) {
		dec2Bin(15);
	}

	public static void dec2Bin(Integer n) {
		if (n > 0) {
			dec2Bin(n / 2);
			System.out.print(n % 2);
		}
	}
}
