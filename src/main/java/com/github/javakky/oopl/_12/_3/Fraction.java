package com.github.javakky.oopl._12._3;

public class Fraction{

	int denominator;
	int numerator; 

	Fraction(int numerator, int denominator){
		this.numerator = numerator;
		this.denominator = denominator;
	}


	double doubleValue(){
		return (double)numerator / denominator;
	}

	int intValue(){
		return numerator / denominator;
	}
}
