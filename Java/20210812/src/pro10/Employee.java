package pro10;
/**
 * 
 *@Title: �Թ���
 *@Deseription: Employee��
 *@author ����
 *@date 2021��8��12��
 *@version 1.0
 *
 */
public class Employee {
	private String name;
	private Employee manager;
	public Employee(String name,Employee manager) {
		this.name=name;
		this.manager=manager;
	}
}
