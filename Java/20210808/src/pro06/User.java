package pro06;
//import �����
import pro06.TestUser;
/**
 * 
 * @Title: User��
 * @Deseription:��Ͷ���֮��Ĺ�ϵ
 * @author ����
 * @date 2021��8��8��
 * @version 1.0
 *
 */
public class User {
//	1.���췽����
//	1.1 ���壺���ڶ���Ĵ��� ���Գ�ʼ��
//	1.2 Ҫ�󣺺���ͬ�� �޷���ֵ
//	1.3 ��Ͷ���֮��Ĺ�ϵ���ࣨģ�壩----���췽���Ĳ��������췽��---->����
//	1.4 �﷨��public ����(�������� ����,...){}
//	1.5 �ص㣺���췽���ڴ��������ʱ�򱻵��á�
//			���췽�������ж����������ͬ�����������ͻ����������ͬ�����������أ���
//			��������޹��췽������ôjavac���Զ�����޲ι��췽����Ĭ�Ϲ��췽������
//			�����д��ڹ��췽������ôjavac�׶β�������޲ι��췽����

//	2.��������̵Ĺؼ���
//	2.1 this �ؼ���
//		���ҵġ�������������ڲ����ʹ��췽�������ԡ�������
//	2.2 package �ؼ���
//		���ڶ���� package ����
//	2.3 import �ؼ���
//		����ͬһ����Ŀ�еİ� import ����.����
//	2.4 static �ؼ���  ��̬�� ��ֹ��
//		��̬��ֻ��ִ��һ��
//		�ڹ��췽��֮ǰִ��
//		Ӧ�ó��������������ļ���������������
	
//	���ñ���
	String userName;
	String passWord;
	boolean gender;
	int age;
	String createDate;

//	�޲ι��췽��
	public User() {
//		�� this �����Լ��Ĺ��췽�������ݴ��ε��ö�Ӧ�Ĺ��췽����
		this("user", "user", true, 10, "2021-08-08");// ������ڵ�һ��
		System.out.println("�޲ι��췽���������ˣ�");

	}

//	�вι��췽��
	public User(String userName, String passWord, boolean gender, int age, String createDate) {
//		this ��������
//		�����Ժ��β�����ͬʱ����Ҫ����this��javac��Ĭ�Ͼͽ�ԭ�����������βΣ�
		this.userName = userName;
		this.passWord = passWord;
		this.gender = gender;
		this.age = age;
		this.createDate = createDate;
		System.out.println(userName + passWord + gender + age + createDate);
		System.out.println("�вι��췽���������ˣ�");
//		this ���ʷ���
//		���÷���ʱ�����Բ���this��javac���Զ�����
		this.login();
	}

//	���÷���
	public void login() {
		System.out.println(userName + " ���ڵ�½��");
	}

	public void reg() {
		System.out.println(userName + " ����ע�ᣡ");
	}

	public void logout() {
		System.out.println(userName + " �˳��ˣ�");
	}
}
