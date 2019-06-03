package com.github.javakky.oopl._5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class SystemIn1{
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char c = 0;
		try{
			c = (char) br.read();
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println(c);
	}
}
