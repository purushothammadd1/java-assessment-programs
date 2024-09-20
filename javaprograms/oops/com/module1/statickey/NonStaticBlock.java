package com.module1.statickey;

public class NonStaticBlock {
	int a;
	int b;
	static int count;
	{
		count++;
		System.out.println("Hello");
	}
	NonStaticBlock(){
		this(100);
		System.out.println("First con");
	}
	NonStaticBlock(int a){
		System.out.println(a);
		this.a=a;
	}
	NonStaticBlock(int a,int b){
		this.a=a;
		this.b=b;
	}
	public static void main(String[] args) {
		NonStaticBlock d1=new NonStaticBlock();
		NonStaticBlock d2=new NonStaticBlock(10,20);
		NonStaticBlock d3=new NonStaticBlock(10);
		System.out.println(NonStaticBlock.count);
	}

}
