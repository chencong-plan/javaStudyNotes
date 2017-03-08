package com.inheritance;

/**
 * @version 1.0 2017��3��8��14:05:10
 * @author chencong
 *
 */

/**
 * ����Ƽ���
 * @author chencong
 * 0 һ��Ҫ��֤���ݵ�˽�л�
 *     ���Բ�Ҫ�ƻ����ݵ�˽���ԡ�����ʵ�����˽�л�����д�����������޸�����get set�����������ʡ�
 *     
 * 1 һ��Ҫ�����ݽ��г�ʼ��
 *     Java����Ծֲ��������г�ʼ�������ǶԶ���ʵ������г�ʼ�������ǲ��ܹ����ֵ�������������
 *     
 * 2 ��Ҫ������ʹ�ù���Ļ�������
 *     �����������������صĻ����������͵�ʹ�ã����������������޸ġ�
 *     ����������ʹ�������������� 
 *       private String street;
 *       private String city;
 *       private String state;
 *       Private int zip;
 *     �����Ļ����������Ϳ��Է�װ��һ����Address�У�Ȼ��ֱ��ʹ��private��Address address
 *     
 * 3  ����������ʵ������Ҫ ������ �޸����ġ�
 *     ��Щ�����һ�������˶��� ��ôʵ������ĳЩ���Ե�ֵ��ȷ���ˡ�����Ա����ְʱ�� һ��Ա����ְȷ������ôԱ����ְʱ��Ͳ��ܹ���ͨ��set �����޸ġ�
 *     
 * 4  ��ְ����������в�� 
 *    ��֤��ְ��һ
 *    
 */    
public class ManagerTest {
	
	public static void main(String [] args){
		//����һ��Manager�����
		Manager boss = new Manager("chen",8000,1996,3,21);
		boss.setBonus(3000);
		
		//����һ��Ա����������
		Employee [] staff = new Employee[3];
		staff[0] = boss;
		staff[1] = new Employee("zhang",5000,2000,12,12);
		staff[2] = new Employee("Li",6000,1999,3,3);
		
		//���Ա��������Ϣ ����������Ա
		for(Employee e:staff){
			System.out.println(e.getName()+"  "+e.getSalary());
		}
	}
}
