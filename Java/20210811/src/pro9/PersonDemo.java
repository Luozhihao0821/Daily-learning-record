package pro9;

public class PersonDemo {

	public static void main(String[] args) {
//		1.����һ��Person()
		Person p =new Person("С��",18);
		
		String n=p.getName();
		System.out.println(n);
		
		int a=p.getAge();
		System.out.println(a);
		
		Person p1=new Person();
//		2.�������ԣ������Ը�ֵ����ȡ���Ե�ֵ(˽�б����޷�ֱ�ӷ���)
//		p1.name="С��";
//		String name1=p1.name;
//		p1.age=20;
//		int age1=p1.age;
		p1.setName("С��");
		String name=p1.getName();
		System.out.println(name);
		
		p1.setAge(20);
		int age=p1.getAge();
		System.out.println(age);
		
//		3.���ʷ���
		p1.say();
	}

}
