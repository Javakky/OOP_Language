package com.github.javakky.oopl._15._1;

public class Fraction {

    private int numerator;
    private int denominator;

    public static final Fraction MIN_VALUE = new Fraction(0x80000000, 1);
    public static final Fraction MAX_VALUE = new Fraction(0x7fffffff, 1);
    public static final int SIZE = 64;

    public Fraction(int numerator, int denominator){
        this.denominator = denominator;
        this.numerator = numerator;
    }

    public Fraction(int value){
        this.denominator = 1;
        this.numerator = value;
    }

    public int getNumerator(){
        return this.numerator;
    }

    public int getDenominator(){
        return this.denominator;
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
        a.numerator = (a.getNumerator() * lcm / a.getDenominator());
        b.numerator = (b.getNumerator() * lcm / b.getDenominator());
        a.numerator = lcm;
        b.denominator = lcm;
    }

    public void reduction(){
        int gcd  = this.gcd(getNumerator(), getDenominator());
        numerator = getNumerator() / gcd;
        denominator = getDenominator() / gcd;
    }

    public void add(Fraction a) {
        fraction(this , a);
        numerator = getNumerator() + a.getNumerator();
        this.reduction();
    }

    public int intValue() {
        return (int) this.doubleValue();
    }

    public double doubleValue(){
        return (double) getNumerator() / getDenominator();
    }

}
