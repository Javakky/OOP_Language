package com.github.javakky.oopl._16._1;

public class Fraction {

    private int numerator;
    private int denominator;

    public static final Fraction MIN_VALUE = new Fraction(0x80000000, 1);
    public static final Fraction MAX_VALUE = new Fraction(0x7fffffff, 1);
    public static final int SIZE = 64;

    public Fraction(int numerator, int denominator){
        setDenominator(denominator);
        setNumerator(numerator);
    }

    public Fraction(int value){
        setDenominator(1);
        setNumerator(value);
    }

    public int getNumerator(){
        return this.numerator;
    }

    public int getDenominator(){
        return this.denominator;
    }

    protected void setNumerator(int numerator){
        this.numerator = numerator;
    }

    protected void setDenominator(int denominator){
        if(denominator == 0){
            throw new ArithmeticException("denominator is zero");
        }
        this.denominator = denominator;
    }

    public static int gcd(int m, int n){
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

    public static int lcm(int m, int n){
        return m * n / gcd(m, n);
    }

    public static void fraction(Fraction a, Fraction b){
        int lcm  = lcm(a.getDenominator(), b.getDenominator());
        a.setNumerator(a.getNumerator() * lcm / a.getDenominator());
        b.setNumerator(b.getNumerator() * lcm / b.getDenominator());
        a.setDenominator(lcm);
        b.setDenominator(lcm);
    }

    public void reduction(){
        int gcd  = this.gcd(getNumerator(), getDenominator());
        setNumerator(getNumerator() / gcd);
        setDenominator(getDenominator() / gcd);
    }

    public void add(Fraction a) {
        fraction(this , a);
        setNumerator(getNumerator() + a.getNumerator());
        this.reduction();
    }

    public int intValue() {
        return (int) this.doubleValue();
    }

    public double doubleValue(){
        return (double) getNumerator() / getDenominator();
    }

}
