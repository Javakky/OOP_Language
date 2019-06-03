package com.github.javakky.oopl._12._1;

import com.github.javakky.oopl._12._1.Fraction;

public class MakeFraction{
	
	public static void main(String[] args){
		
		Fraction f = new Fraction();
		
		f.denominator = 2;
		f.numerator = 3;

		System.out.println(f.numerator + "/" + f.denominator);
		System.out.println(f.doubleValue());
		
	}
	
}
