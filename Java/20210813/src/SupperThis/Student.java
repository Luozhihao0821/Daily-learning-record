package SupperThis;

public class Student extends Person {
	private double score;

	public Student() {
//		1.super();//���ø�����޲ι��췽����javac���Զ�����
		super(null, 0);
		System.out.println("---Student()---");
	}

	public Student(String name, int age, double score) {
//		2.super();//���ø�����޲ι��췽����javac���Զ�����
		super(name, age); // 3.���ʸ���Person���вι��췽��
		System.out.println("---Student(String name,int age,double score)---");
//		4.ʹ�� super(name,age);���ø���Person���вι��췽����Ϳ��Բ�����������ʵ�ָ�ֵ����û��ֱ��ʹ�ø���Person�����ԣ�
//		5.��ʱ ����Person�����ԾͿ���Ϊ private�����ԣ� ��Ϊ����Studentû��ֱ��ʹ�ø���Person�����ԣ�����ͨ��super(ֵ��ֵ)�ķ�ʽ���ø���Person���вι��췽����ʵ�ָ�ֵ��
//		this.name=name;
//		this.age=age; 
		this.score = score;
		super.age = age; // ���ʸ�������

	}

//	6.������д
	public void say() {
		super.say(); // ���ʸ��෽��
		System.out.println("Student˵�����ѽ��"); //�����Լ�������
	}
	
//	6.��������
	public void say(String name) {
		System.out.println(name+"˵�����ѽ��"); //�����Լ�������
	}

	public void study() {
		super.say(); // ���ʸ��෽��
		this.say(); //�����Լ��ķ���
		System.out.println("--------day day up--------");
	}

}
