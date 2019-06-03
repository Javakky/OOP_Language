package com.github.javakky.oopl._12._2;

public class Fraction{

	int denominator;
	int numerator; 

	//�R���X�g���N�^
	Fraction(int x, int y){
		numerator = x;
		denominator = y;
	}


	double doubleValue(){
		return (double)numerator / denominator;
	}

	int intValue(){
		return numerator / denominator;
	}
}