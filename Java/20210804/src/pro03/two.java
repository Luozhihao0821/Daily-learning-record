package pro03;
/**
 * 
 *@Title:��������
 *@Deseription:������������/��������������Ϊ�����²�ͬ����Ч��
 *@author ����
 *@date 2021��8��4��
 *@version 1.0
 *
 */
public class two {

	public static void main(String[] args) {
		

//		1.����������������--����ֵ
		int a = 10;
		int b = 20;
		int c = fun01Add(a, b);
		System.out.println("���c=" + c);

//		2.������������--���ݵ�ַ����ı��βε�ֵ��
		StringBuilder s1 = new StringBuilder("abc");
		StringBuilder s2 = new StringBuilder("123");

		StringBuilder sb = concat(s1, s2);
		System.out.println("sb=" + sb);

	}

	public static int fun01Add(int m, int n) {
		return m + n;
	}

	public static StringBuilder concat(StringBuilder st1, StringBuilder st2) {
		StringBuilder st3 = st1.append(st2);
		return st3;
	}
}
