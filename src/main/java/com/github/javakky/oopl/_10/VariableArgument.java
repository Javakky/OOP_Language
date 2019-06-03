package com.github.javakky.oopl._10;

public class VariableArgument{
	public static void main(String[] args){
		System.out.println(add(5, 2));
		System.out.println(add(2, 5, 7, 8));
	}

	static int add(int a, int... b){
		for(int i: b){
			a += i;
		}
		return a;
	}
}
