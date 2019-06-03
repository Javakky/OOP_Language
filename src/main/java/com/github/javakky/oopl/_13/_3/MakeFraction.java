package com.github.javakky.oopl._13._3;

import com.github.javakky.oopl._13._3.Fraction;

public class MakeFraction{
	
	public static void main(String[] args){
		
		Fraction f5 = new Fraction(2, 4);
		System.out.println(f5.numerator + "/" + f5.denominator);
		f5.reduction();
		System.out.println(f5.numerator + "/" + f5.denominator);
		
	}
	
}
