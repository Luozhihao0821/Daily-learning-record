package Person;
/**
 * 
 *@Title: �̳�--����һ
 *@Deseription: Teacher��-�̳�Person��
 *@author ����
 *@date 2021��8��13��
 *@version 1.0
 *
 */
public class Teacher extends Person {
	private double salary; // нˮ

	public Teacher() {

	}
	public Teacher(String name, boolean gender, int age, double salary) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.salary = salary;
	}
	public void teaching() {
		System.out.println(this.name + "�����ڿ�...");
	}
	public void assignHomework() {
		System.out.println(this.name + "���ڲ�����ҵ...");
	}
}
