package com.github.javakky.oopl._13._3;

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

    void reduction(){
        int gcd  = this.gcd(numerator, denominator);
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    static int lcm(int m, int n){
        return m * n / gcd(m, n);
    }

    static void fraction(Fraction a, Fraction b){
        int lcm  = lcm(a.denominator, b.denominator);
        a.numerator = (a.numerator * lcm / a.denominator);
        b.numerator = (b.numerator * lcm / b.denominator);
        a.denominator = lcm;
        b.denominator = lcm;
    }

    void add(Fraction a) {
        fraction(this , a);
        numerator = numerator + a.numerator;
        this.reduction();
    }

    int intValue() {
        return (int) this.doubleValue();
    }

    double doubleValue(){
        return (float)this.numerator / this.denominator; 
    }

}