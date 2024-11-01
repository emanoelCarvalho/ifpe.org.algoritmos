package org.ifpe.algoritmos.listOne;

public class SumRecursion {

	public static void main(String[] args) {
		System.out.println(sum(0, 4));
	}

	public static int successor(int n) {
		return n + 1;
	}

	public static int predecessor(int n) {
		return n - 1;
	}

	public static int sum(int x, int y) {
		if (y == 0) {
			return x;
		} else if (y > 0) {
			return sum(successor(x), predecessor(y));
		} else {
			return sum(predecessor(x), successor(y));
		}
	}

}
