package com.neusoft.$temp.base.extendsOrder;

public  class Parent {
	public static int age;
	public String name;
	static {
		System.out.println("父类的静态代码块 age:"+age);
		age = 10;
	}
	{
		System.out.println("父类的实例代码块name:"+name);
		name ="xiaoming";
		int i;
	}
	public Parent() {
		System.out.println("父类构造器age:"+age);
		age =20;
	}
	public void test() {
		System.out.println("父类name:"+name+" "+"age:"+age);
	}
	

	@Override
	public String toString() {
		return "Parent [name=" + name + "age=" + age + "]";
	}
	public void test2() {
		test();
	}

}
