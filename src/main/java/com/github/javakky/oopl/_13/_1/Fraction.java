package com.github.javakky.oopl._13._1;

public class Fraction {

    int numerator;
    int denominator;

    //�ŏ��l��int�^�̍ŏ�(0x80000000)�Ɠ���
    static final Fraction MIN_VALUE = new Fraction(0x80000000, 1);

    //�ő�l��int�^�̍ő�(0x7fffffff)�Ɠ���
    static final Fraction MAX_VALUE = new Fraction(0x7fffffff, 1);
	
    static final int SIZE = 64; //int�^2���̃f�[�^

    Fraction(int numerator, int denominator){
        this.denominator = denominator;
        this.numerator = numerator;
    }

    Fraction(int value){
        denominator = 1;
        numerator = value;
    }

    int intValue() {
        return (int) this.doubleValue();
    }

    double doubleValue(){
        return (float)this.numerator / this.denominator; 
    }

}