package com.neusoft.base.answer;

public class Ex11 {

	public static void main(String[] args) {
/*	����1
 		for (int i = 1000; i <= 9999; i++) {
			int ge = i % 10;
			int shi = (i % 100) / 10;//int shi=(i/10)%10;
			int bai = (i / 100) % 10;//int bai=(1/100)%10;
			int qian = i / 1000;//int qian=(i/1000)%10;
			if (ge == qian && shi == bai) {
				System.out.println(i);
			}

		}*/
		for (int i = 1000; i <= 9999; i++) {
			String a = Integer.toString(i);
			StringBuffer s = new StringBuffer(a);
			String t = s.reverse().toString();
			if (a.equals(t)) {
				System.out.println(s);
			}
		}

		//341422

	}

}
