package com.github.javakky.oopl._13._1;

import com.github.javakky.oopl._13._1.Fraction;

public class MakeFraction{
	
	public static void main(String[] args){
		
		Fraction f1 = new Fraction(1);
		Fraction f2 = Fraction.MAX_VALUE;
		System.out.println(Fraction.SIZE); //���ׂē����l
		System.out.println(f1.SIZE); //���ׂē����l
		System.out.println(f2.SIZE); //���ׂē����l

	}
	
}
