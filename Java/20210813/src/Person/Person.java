package Person;
/**
 * 
 *@Title: �̳�--����һ
 *@Deseription: Person��
 *@author ����
 *@date 2021��8��13��
 *@version 1.0
 *
 */
public class Person {
	protected String name; //����
	protected boolean gender; //�Ա�
	protected int age; //����
	public Person(){
		
	}
	public Person(String name, boolean gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public void move() {
		System.out.println(name+"��������....");
	}
	public void say() {
		System.out.println(name+"˵�����Ϻã�");
	}
}
