package com.neusoft.array.answer;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int[] arr = { 100, 200, 35, 80, 99, 200, 3, 20 };
		int m=0;
		System.out.print("当前数组为：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		// 寻找数组里的最大最小值
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			// 比较之后取较大的
			if (max < arr[i]) {
				max = arr[i];
			}			
			// 比较之后取较小的
			if (min > arr[i]) {
				min = arr[i];
			}			
		}
		System.out.println();
		System.out.println("max="+max);
		System.out.println("min="+min);
		
		/////////////////////////////////
		//查找数组中是否存在某元素
		while(m<1) {
		System.out.print("请输入一个数进行查找：");
		Scanner sc = new Scanner(System.in);
		int get = sc.nextInt();
		boolean flag=false;//设置标志位看有没有完成某事情
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]==get) {
				System.out.println("数组中存在这个数！");
				flag=true;
				break;
			}
		}
		if(flag==false) {
		System.out.println("数组中不存在这个数！");
		}
		System.out.print("是否还要继续？0继续    1退出");
		 m = sc.nextInt();
		}	

		///////////////////////////////////
		//二分查找法
		m=0;
		System.out.print("数组变成了");
		//sort方法会使数组本身发生改变
		Arrays.sort(arr);
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		while(m<1) {
		System.out.print("请输入一个数进行查找（二分法）：");
		Scanner sc = new Scanner(System.in);
		int get = sc.nextInt();
		int low = 0;
		int high = arr.length -1;
		boolean flag=false;
		
		while (low<=high) {      //注意有等号
			int mid = (low+high)/2;
			if(arr[mid]==get) {
				System.out.println("找到了相同的元素！");
				flag=true;
				break;
			}
			if(arr[mid]<get) {
				low = mid+1;
			}
			if(arr[mid]>get) {
				high = mid-1;
			}			
		}
		if(flag==false) {
			System.out.println("没找到相同的元素！");
			}
		System.out.print("是否还要继续？0继续    1退出");
		m = sc.nextInt();
		}
		
		
		///////////////////////////
		//binarySearch()测试
		m=0;
		while(m<1) {
		System.out.print("请输入一个数进行查找（内置二分法）：");
		Scanner sc = new Scanner(System.in);
		int get = sc.nextInt();
		int a=Arrays.binarySearch(arr, get);
		if(a>=0) {
		System.out.println("数组arr["+a+"]="+arr[a]);
		}else {
		System.out.println("没找到相同的元素！");
			}
		System.out.print("是否还要继续？0继续    1退出");
		m = sc.nextInt();
		}
		
		
		////////////////////
		//copyOf()和copyOfRange()测试
		System.out.print("现在又复制了一个新数组！");
		int[] arrCopy1=Arrays.copyOf(arr, 4);
		//数组长度大于原数组用默认值填充
		int[] arrCopy2=Arrays.copyOf(arr, 10);
		//包含from不包含to
		int[] arrCopy3=Arrays.copyOfRange(arr, 2, 6);
		int[] arrCopy4=Arrays.copyOfRange(arr, 2, 10);
		System.out.println();
		System.out.println("原数组为：");
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		for(int a:arrCopy1) {
			System.out.print(a+" ");
		}
		System.out.println();
		for(int a:arrCopy2) {
			System.out.print(a+" ");
		}
		System.out.println();
		for(int a:arrCopy3) {
			System.out.print(a+" ");
		}
		System.out.println();
		for(int a:arrCopy4) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		
		/////////////////////
		//equals()测试
		boolean flag=false;
		flag=Arrays.equals(arr, arrCopy1);
		System.out.println("arr和arrCopy1相等吗？："+flag);

		
		////////////////////////
		//fill()测试
		Arrays.fill(arr, 2, 5, 20);
		System.out.println("填充后的数组为：");
		for(int a:arr) {
			System.out.print(a+" ");
		}
		
				
		/////////////////////////
		//toString()测试
		String str=Arrays.toString(arr);
		System.out.println();
		System.out.println("将数组转化为字符串为："+str);
		//输出结果为：[3, 17, 20, 20, 20, 100, 200, 200]
		//无格式的输出可以用以下方式：
		char[] ch= {'a','1','c'};
		String str1=new String(ch);
		System.out.println(str1);
		String str2=String.valueOf(ch);
		System.out.println(str2);
		//二维数组：char[][] panelCopy=Arrays.copyOf(panel, panel.length);
		
		
		//////////////////////////
		//逆向输出一个数组
		System.out.println("当前数组为：");
		for(int a:arr) {
			System.out.print(a+" ");
		}
		int[] revArr=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			revArr[i]=arr[arr.length-i-1];
		}
		System.out.println();
		System.out.println("逆向改变后的数组为：");
		for(int a:revArr) {
			System.out.print(a+" ");
		}
	}
}

