package com.github.javakky.oopl._12._4;

public class Fraction{

	int denominator; 
	int numerator; 

	Fraction(int numerator, int denominator){
		this.numerator = numerator;
		this.denominator = denominator;
	}

	Fraction(int value){
		this.numerator = value;
		this.denominator = 1;
	}

	double doubleValue(){
		return (double)numerator / denominator;
	}

	int intValue(){
		return numerator / denominator;
	}
}
