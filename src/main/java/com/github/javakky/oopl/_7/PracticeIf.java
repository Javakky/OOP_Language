package com.github.javakky.oopl._7;

import java.util.Scanner;
public class PracticeIf{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		if(i < 0){
			System.out.println("i��0�����ł�");
		}else if(i == 0){
			 System.out.println("i��0�ł�");
		}else{
			System.out.println("i��0���߂ł�");
		}
	}
}
