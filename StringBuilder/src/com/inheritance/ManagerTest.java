package com.inheritance;

/**
 * @version 1.0 2017年3月8日14:05:10
 * @author chencong
 *
 */

/**
 * 类设计技巧
 * @author chencong
 * 0 一定要保证数据的私有化
 *     绝对不要破坏数据的私有性。保持实例域的私有化，编写访问器或者修改器（get set方法）来访问。
 *     
 * 1 一定要对数据进行初始化
 *     Java不会对局部变量进行初始化，但是对对象实例域进行初始化，但是不能够过分的依赖编译器。
 *     
 * 2 不要再类中使用过多的基本类型
 *     用其他的类代替多个相关的基本数据类型的使用，这样有利于理解和修改。
 *     例如在类中使用了这样的数据 
 *       private String street;
 *       private String city;
 *       private String state;
 *       Private int zip;
 *     这样的基本数据类型可以封装在一个类Address中，然后直接使用private　Address address
 *     
 * 3  并不是所有实例域都需要 访问器 修改器的。
 *     有些情况下一单创建了对象 那么实例域中某些属性的值就确定了。例如员工入职时间 一单员工入职确定后，那么员工入职时间就不能够再通过set 进行修改。
 *     
 * 4  对职责过多的类进行拆分 
 *    保证类职责单一
 *    
 */    
public class ManagerTest {
	
	public static void main(String [] args){
		//构造一个Manager类对象
		Manager boss = new Manager("chen",8000,1996,3,21);
		boss.setBonus(3000);
		
		//构造一个员工对象数组
		Employee [] staff = new Employee[3];
		staff[0] = boss;
		staff[1] = new Employee("zhang",5000,2000,12,12);
		staff[2] = new Employee("Li",6000,1999,3,3);
		
		//输出员工工资信息 包含管理人员
		for(Employee e:staff){
			System.out.println(e.getName()+"  "+e.getSalary());
		}
	}
}
