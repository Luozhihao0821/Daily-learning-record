package pro10;
/**
 * 
 *@Title: �Թ���
 *@Deseription: TestEmployee������
 *@author ����
 *@date 2021��8��12��
 *@version 1.0
 *
 */
public class TestEmployee {
	public static void main(String[] args) {
		Employee manager=new Employee("����",null);
		Employee emp=new Employee("����", manager);
	}
}
