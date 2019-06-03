package com.github.javakky.oopl._12._2;

import com.github.javakky.oopl._12._2.Fraction;

public class MakeFraction{
	
	public static void main(String[] args){
		
		Fraction f = new Fraction(2, 3);

		System.out.println(f.numerator + "/" + f.denominator);
		System.out.println(f.doubleValue());
		
	}
	
}
