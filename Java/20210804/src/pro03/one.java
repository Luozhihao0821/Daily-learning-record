package pro03;

/**
 *
 *@Title: ����
 *@Deseription:�������弰����
 *@author ����
 *@date 2021��8��4��
 *@version 1.0
 *
 */

public class one {
	
	public static void main(String[] args) {

//		2.��������
		fun01();
		int c=fun02Add(7,8);//����ʵ�Σ�������ֵ����
		System.out.println("c:"+c);//15
	}

//	1.��������
//	��̬��Ա����
	public static void fun01() {
		System.out.println("Hello Java!");//Hello Java!
	}
	public static int fun02Add(int a,int b) {//��������ʱ�������β�
		int sum=a+b;
		return sum;//���з���ֵ�ĺ���
	}
}
