package com.chencong.StringBuilder;

public class TestStringBuilder {
		/**
		 * StringBuiler类，前身是StringBuffer 虽然效率比较低，但是允许采用多线程的方式来添加或删除字符的操作。
		 * 如果所有字符串在一个单线程中编辑，则应该采用StringBuilder append()方法
		 */
		
	public static void main(String [] args){
		
		/**
		 * 构造一个空的字符串构造器 StringBuilder()
		 * 
		 */
		StringBuilder builder = new StringBuilder("Hello_");
		// StringBuilder append(char c)  
		// StringBuilder append(String str)
		// 对StringBuilder 对象追加一个字符串或代码单元 并且返回
		builder.append("world"); 
		// int length() 返回构建器中或缓冲区中代码单元数量
		System.out.println(builder.length());  
		
		//StringBuilder insert(int offset , char c);  在offset的位置插入c
		System.out.println(builder.insert(2, "chen"));
		
		//StringBuilder delete(int start,int end ); 删除start 到 end 中间的字符，并且将剩余的返回
		System.out.println(builder.delete(2, 6));  
		
		//String toString() 返回一个与构建器或者缓冲器内容相同的字符串
		String str = builder.toString();
		System.out.println(str.length());  //尝试输出字符串的长度
			
		
		
	}
}
