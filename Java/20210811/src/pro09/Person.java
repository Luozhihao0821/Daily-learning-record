package pro09;

public class Person {

//	˽�б������ⲿ���޷�����
	private String name;
	private int age;

//	ʵ���ⲿ���ʵķ���
//	��name�����ṩ��ֵ�ķ���
	public void setName(String name) {
		this.name = name;
	}

//	��name�����ṩȡֵ�ķ���
	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		if(age>0&&age<120) {
			this.age = age;
		}
		System.out.println("�Ƿ����ݣ�");
	}

	public int getAge() {
		return this.age;
	}

	public Person() {

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void say() {
		System.out.println(this.name + "˵������������ã�����");
	}

}
