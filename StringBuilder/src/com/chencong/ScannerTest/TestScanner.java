package com.chencong.ScannerTest;

import java.util.*;
public class TestScanner {
	/**
	 * ��׼�����----System.out.println()
	 * ��׼������----System.in  ������Ҫ���ȹ���һ��Scanner�Ķ���
	 * Scanner s = new Scanner(System.in);
	 */
	
	/**
	 * Scanner (InputStream in)  �ø���������������һ������ 
	 * String nextLine()  ��ȡ�������һ������
	 * String next()   ��ȡ�������һ������(�Կո���Ϊ�ָ���)
	 * String nextDouble()  ��ȡ��ת����һ����ʾ�������߸��������ַ�����
	 * boolean hasNext()  ����ж��������Ƿ�����������
	 * 
	 * @param args
	 */
	
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		
		System.out.println("what is your name?");
		String name = s.nextLine();  //��ȡһ�� �����ո�
		
		System.out.println("How old are you?");
		int year = s.nextInt();
		
		System.out.println("Hello "+name +" Next year you'll be "+ (year+1));
		
		String str = s.next();  //��ȡ��һ������ �ո���� 
		System.out.println(str);
		
		boolean b = s.hasNext();   //����������Ƿ�����������
		System.out.println(b);
		
	}
}
