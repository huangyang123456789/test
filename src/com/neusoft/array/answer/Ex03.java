package com.neusoft.array.answer;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		double[] score=new double[10];
		System.out.println("请输入选手的10个得分：");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<score.length;i++) {
			int i1 = 111;
			score[i]=sc.nextDouble();
		}
		Arrays.sort(score);
		double plus=0;
		for(int i=1;i<score.length-1;i++) {
			plus+=score[i];
		}
		double ave=plus/8;
		System.out.println("该选手的最终得分为："+ave);
	}

}
