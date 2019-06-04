package com.github.javakky.oopl._16._1;

import com.github.javakky.oopl._16._1.Fraction;

public class MakeFraction{
	
	public static void main(String[] args){
		
		//error
		com.github.javakky.oopl._16._1.Fraction f1 = new Fraction(1, 0);
		System.out.println(f1.getNumerator() + "/" + f1.getDenominator());
	}
	
}
