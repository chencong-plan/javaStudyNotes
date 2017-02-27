package com.chencong.ScannerTest;

import java.util.*;
public class TestScanner {
	/**
	 * 标准输出流----System.out.println()
	 * 标准输入流----System.in  但是需要首先构造一个Scanner的对象
	 * Scanner s = new Scanner(System.in);
	 */
	
	/**
	 * Scanner (InputStream in)  用给定的输入流创建一个对象 
	 * String nextLine()  读取输入的下一行内容
	 * String next()   读取输入的下一个单词(以空格作为分隔符)
	 * String nextDouble()  读取并转换下一个表示整数或者浮点数的字符序列
	 * boolean hasNext()  检测判断输入中是否还有其他单词
	 * 
	 * @param args
	 */
	
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		
		System.out.println("what is your name?");
		String name = s.nextLine();  //读取一行 包括空格
		
		System.out.println("How old are you?");
		int year = s.nextInt();
		
		System.out.println("Hello "+name +" Next year you'll be "+ (year+1));
		
		String str = s.next();  //读取下一个单词 空格结束 
		System.out.println(str);
		
		boolean b = s.hasNext();   //检测输入中是否还有其他单词
		System.out.println(b);
		
	}
}
