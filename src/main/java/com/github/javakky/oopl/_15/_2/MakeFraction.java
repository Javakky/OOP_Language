package com.github.javakky.oopl._15._2;

public class MakeFraction{
	
	public static void main(String[] args){
		
		Fraction f = new Fraction(1, 2);
		
		//error
		//System.out.println(f.numerator + "/" + f.denominator);
		
		//ok
		System.out.println(f.getNumerator() + "/" + f.getDenominator());
		
	}
	
}
