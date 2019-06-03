package com.github.javakky.oopl._13._2;

public class Fraction {

    int numerator;
    int denominator;

    static final Fraction MIN_VALUE = new Fraction(0x80000000, 1);

    static final Fraction MAX_VALUE = new Fraction(0x7fffffff, 1);
	
    static final int SIZE = 64;

    Fraction(int numerator, int denominator){
        this.denominator = denominator;
        this.numerator = numerator;
    }

    Fraction(int value){
        denominator = 1;
        numerator = value;
    }

    static int gcd(int m, int n){
        int r = 0;
		
        if(m < n){
            int tmp;
            tmp = n;
            n = m;
            m = tmp;
        }
		
        while (n > 0) {
			
            r = m % n;
            m = n;
            n = r;
        }
		
        return m;
    }

    int intValue() {
        return (int) this.doubleValue();
    }

    double doubleValue(){
        return (float)this.numerator / this.denominator; 
    }

}