package SupperThis;

public class Test {

	public static void main(String[] args) {
//		1.����һ��ѧ������
//		�ȵ��ø���Person���޲ι��캯�����ڵ���Student���췽��
		Student stu=new Student();
		
//		2.����һ��Person����
		Student stu1=new Student("�",20,99);
		System.out.println(stu1);
		stu1.say(); //Student˵�����ѽ�� (ΪStudent�Լ���say()����)
		stu1.say("СС"); //СС˵�����ѽ��
	}
}
