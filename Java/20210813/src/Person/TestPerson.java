package Person;
/**
 * 
 *@Title: �̳�--����һ
 *@Deseription: TestPerson������
 *@author ����
 *@date 2021��8��13��
 *@version 1.0
 *
 */
public class TestPerson {
	public static void main(String[] args) {
//		1.����һ��ѧ������
		Student stu=new Student("��С��",true,12,90);
		stu.say(); //��С��˵�����Ϻã�
		stu.move(); //��С����������....
		stu.study(); //��С�� ����ѧϰ....
		
//		2.����һ����ʦ����
		Teacher tea=new Teacher("����",true,35,2000);
		tea.say(); //����˵�����Ϻã�
		tea.teaching(); //���������ڿ�...
		tea.assignHomework(); //�������ڲ�����ҵ...
	}
}
