package com.github.javakky.oopl._14;

public class MakeFraction{
	
	public static void main(String[] args){
		
		Fraction f3 = new Fraction(1, 2);
		Fraction f4 = new Fraction(1, 3);
		
		Fraction.fraction(f3, f4);

		System.out.println(f3.numerator + "/" + f3.denominator);
		System.out.println(f4.numerator + "/" + f4.denominator);

	}
	
}
