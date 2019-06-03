package com.github.javakky.oopl._12._1;

public class Fraction{

	int denominator; //����
	int numerator; //���q

	double doubleValue(){
		return (double)numerator / denominator;
	}

	int intValue(){
		return numerator / denominator;
	}
}