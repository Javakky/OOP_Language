package com.github.javakky.oopl._16._2;

public class MakeFraction{
	
	public static void main(String[] args){
		
		try {
			Fraction f = new Fraction(1, 0);
			System.out.println(f.getNumerator() + "/" + f.getDenominator());
		}catch(ArithmeticException e){
			e.printStackTrace();
		}
				
		try {
			Fraction f = new Fraction(1, 2);
			System.out.println(f.getNumerator() + "/" + f.getDenominator());
		}catch(ArithmeticException e){
			e.printStackTrace();
		}
		
	}
	
}
