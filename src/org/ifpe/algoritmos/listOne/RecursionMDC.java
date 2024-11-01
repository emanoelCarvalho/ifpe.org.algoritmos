package org.ifpe.algoritmos.listOne;

public class RecursionMDC {
	public static void main(String[] args) {
		System.out.println(mdc(27, 18));
	}

	public static int mdc(int x, int y) {
		if (x == y) {
			return x;
		} else if (x > y) {
			return mdc((x - y), y);
		}
		return mdc(y, x);

	}
}
