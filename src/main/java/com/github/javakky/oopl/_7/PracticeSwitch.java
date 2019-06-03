package com.github.javakky.oopl._7;

import java.util.Scanner;
public class PracticeSwitch{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		switch(i){
			case 1:
				System.out.println(1);
				break;
			case 2:
				System.out.println(2);
				break;
			default:
				System.out.println("����ȊO");
				break;
		}
	}
}
