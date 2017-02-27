package com.chencong.StringBuilder;

public class TestStringBuilder {
		/**
		 * StringBuiler�࣬ǰ����StringBuffer ��ȻЧ�ʱȽϵͣ�����������ö��̵߳ķ�ʽ����ӻ�ɾ���ַ��Ĳ�����
		 * ��������ַ�����һ�����߳��б༭����Ӧ�ò���StringBuilder append()����
		 */
		
	public static void main(String [] args){
		
		/**
		 * ����һ���յ��ַ��������� StringBuilder()
		 * 
		 */
		StringBuilder builder = new StringBuilder("Hello_");
		// StringBuilder append(char c)  
		// StringBuilder append(String str)
		// ��StringBuilder ����׷��һ���ַ�������뵥Ԫ ���ҷ���
		builder.append("world"); 
		// int length() ���ع������л򻺳����д��뵥Ԫ����
		System.out.println(builder.length());  
		
		//StringBuilder insert(int offset , char c);  ��offset��λ�ò���c
		System.out.println(builder.insert(2, "chen"));
		
		//StringBuilder delete(int start,int end ); ɾ��start �� end �м���ַ������ҽ�ʣ��ķ���
		System.out.println(builder.delete(2, 6));  
		
		//String toString() ����һ���빹�������߻�����������ͬ���ַ���
		String str = builder.toString();
		System.out.println(str.length());  //��������ַ����ĳ���
			
		
		
	}
}
