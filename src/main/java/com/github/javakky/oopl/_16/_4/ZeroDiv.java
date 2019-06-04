package com.github.javakky.oopl._16._4;

public class ZeroDiv{
	public static void main(String[] args){
		try{
			int i = 2;
			i /= 0;
		}catch(ArithmeticException e){
			e.printStackTrace();//����ŃG���[�̓��e���\���ł���B
		}
	}
}
