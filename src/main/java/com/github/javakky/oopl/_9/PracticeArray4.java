package com.github.javakky.oopl._9;

import java.util.Arrays;
public class PracticeArray4{
	public static void main(String[] args){
		String[][] str = new String[2][5];
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 5; j++){
			str[i][j] = "a";
			}
		}
		System.out.println(Arrays.deepToString(str));
	}
}
