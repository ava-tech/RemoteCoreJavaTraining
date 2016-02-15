package org.labs;

import static java.lang.Integer.*;

public class Collar {
	
	Collar(){}

	public static int transformNumber(int n) {
		int radix = 2;
		int output = 0;
		output += radix * n;
		radix = output / radix;
		if (output < 14) {
			return output;
		} else {
			output = output * radix / 2;
			return output;
		}

	}
	
	public static void main(String[] args){
		System.out.println(MAX_VALUE);
		System.out.println(MIN_VALUE);
		System.out.println(transformNumber(7));
	}
}
