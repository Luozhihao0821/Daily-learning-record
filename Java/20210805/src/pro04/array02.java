package pro04;

import java.util.Scanner;

/**
 * 
 * @Title: �������Ӧ��--�ӿ���̨����10������������������
 * @Deseription:
 * @author ����
 * @date 2021��8��5��
 * @version 1.0
 *
 */
public class array02 {

	public static void main(String[] args) {
		int[] arr = getArray();
//		�������������
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println("��" + (i + 1) + "��Ԫ��Ϊ��" + arr[i]);
		}

	}

//	��ֵ������
	private static int[] getArray() {
		int arr[] = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("�������" + (i + 1) + "��������");
			arr[i] = getInt();
		}
		return arr;
	}

//	�Ӽ�������
	private static int getInt() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

}
