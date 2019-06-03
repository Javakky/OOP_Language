package com.github.javakky.oopl._8;

public class PracticeDoWhile{
	public static void main(String[] args){
		int i = 10;
		do{
			if(i == 10){
				i = 0;
			}
			System.out.println(i);
			i++;
		}while(i < 5);
	}
}
