package com.github.javakky.oopl._15._1;

public class MakeFraction{
	public static void main(String[] args) {

		Fraction f1 = new Fraction(2, 4);
		//�z��̑��
		f1.reduction();
		System.out.println(f1.getNumerator() + "/" + f1.getDenominator());
	}
}
