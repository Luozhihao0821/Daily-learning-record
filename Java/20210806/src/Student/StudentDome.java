package Student;

public class StudentDome {
//	
	public static void main(String[] args) {
//		1.�������
		int i;
		String str;
		/**
		 * object02���ࣨ�������ͣ� obj�������������ã�
		 */
		Student obj;

//		2.��Ͷ��� ���� ���� ����֮��Ĺ�ϵ
//		2.1.��������
		Student s;
//		2.2.����һ������
		s = new Student();
//		2.3.��������
//		2.3.1���Ը�ֵ
		s.name = "С��";
		s.age = 25;
		s.gender = true;
//		2.3.2ȡֵ
		String n = s.name;
		int a = s.age;
		boolean g = s.gender;
		System.out.println("������" + n + "�����䣺" + a + "���Ա�" + g);

//		2.4.��������
		String nam=s.getName();
		System.out.println("����Ϊ��"+nam);
		s.study();
	}
}
