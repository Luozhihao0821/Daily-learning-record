package pro12;

/**
 * 
 * @Title: ��̬
 * @Deseription: ���������ء���д�����ݶ�̬�󶨡��������ݵ�����ת��
 * @author ����
 * @date 2021��8��14��
 * @version 1.0
 *
 */
public class TestStudnet {

	public static void main(String[] args) {
//		1.��Ϊ��̬
//		1.1.����(���ִ�������ֵ�ķ�ʽ)
//		1.1.1 ͨ���޲ι��췽������������set�ķ�ʽ��ֵ
		Student stu = new Student(); // ����һ��ѧ������
		stu.setName("Andy");
		stu.setAge(20);
		stu.setGender(true);
		stu.setScore(90);
//		1.1.2 ͨ���вι��췽����ֵ
		Student stu1 = new Student("Tom", 23, true, 88);

//		1.1.3 �������������ͬ������,�����б�ͬ�ķ�����ʵ�����أ����ݴ���ִ�ж�Ӧ������
		stu1.eat("��Ϻ"); // ����Ե���Ϻ (Person����ķ���)
		stu1.eat(5); // ����Ե��� 5 �뷹 ��Student����ķ�����
//		1.1.4 �������������ͬ�ķ��������า�Ǹ���ķ���ʵ�����أ�ִ�����෽��
		stu1.say(); // ���ѽ������ �˴ο��Ե÷֣�88.0

//		1.2.��д
//		1.2.1 �������p�����������Studentʵ�����������ʹ�������
		Person p = stu1;
		p.say(); // �˴ο��Ե÷֣�88.0

//		1.2.2 �������p�����������Teacherʵ�����������ʹ�������
		p = new Teacher("Tey", 40, true, 4000);
		p.say(); // ͬѧ�Ǻú�ѧϰ���������ϣ�����

//		2.���ö�̬
		Person p1 = new Student("Adeyt", 20, true, 92);
			   p1 = new Teacher("Feny", 45, false, 4000);

//		3.��̬��
		/** ����׶κ�ִ�н׶����Ͳ�һ�µ�����
		 * javac������׶Σ�����﷨�� p2:Person p2.say()���� ---> Person�����say()����  (����ͨ������ִ�У����Ե�Person������û��say()����ʱ������ͻᱨ��) 
		 * java ��ִ�н׶Σ���������p2:Student p2.say()���� ---> Student�����say()����
		 */
		Person p2 = new Student("Adey", 20, true, 92);
		p2.say(); //�˴ο��Ե÷֣�92.0
		
//		4.�������ݵ�����ת��
		Student stu2 = new Student("Tom", 23, true, 88);
//		4.1 �Զ�ת�� stu2��Student  p3:Person  Student --> Person (���������Ǹ������)
		Person p3=stu2; 
		p3.say(); //�˴ο��Ե÷֣�88.0
//		4.2 ǿ������ת�� p3:Person stu3��Student  Person --> Student ������
		Student stu3=(Student) p3;
		stu3.say(); //�˴ο��Ե÷֣�88.0
//		4.3 ����ת���쳣  java.lang.ClassCastException (ͬһ����������໥ת������)
//		Person p4 = new Teacher("Feny", 45, false, 4000);
//		Student stu4=(Student) p4; //java.lang.ClassCastException����
//		 ���ת������(instanceof �����������)
		Person p4 = new Teacher("Feny", 45, false, 4000);
		boolean isClass=p4 instanceof Student;
		if(isClass) {
			Student stu4=(Student) p4;
		}else {
			System.out.println("���Ͳ�ƥ�䣬����ǿ��ת��������"); //���Ͳ�ƥ�䣬����ǿ��ת��������
		}
	}
}
