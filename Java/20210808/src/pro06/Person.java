package pro06;

/**
 * 
 * @Title:static �ؼ���
 * @Deseription:
 * @author ����
 * @date 2021��8��8��
 * @version 1.0
 *
 */
public class Person {
//	��̬��ֻ��ִ��һ��
//	�ڹ��췽��֮ǰִ��
//	Ӧ�ó��������������ļ���������������
//	ע�⣺��˶��ھ�̬������˵����û��this�ġ�
//		�ھ�̬�����в��ܷ�����ķǾ�̬��Ա�����ͷǾ�̬��Ա����
//		�Ǿ�̬��Ա����/������������������Ķ�����ܹ������á�

	String name;

//	2.��̬����
	static int a = 4;

//	1.��̬��
	static {
		System.out.println("Person�о�̬��");
	}

	public Person() {
		System.out.println("�޲ι��췽��");
	}

	public Person(String name) {
		this.name = name;
	}
	void a() {
		out();
	}

//	3.��̬����
	public static void out() {
		System.out.println("�����");
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

}
