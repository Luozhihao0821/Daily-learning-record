package pro04;

import java.util.Arrays;

/**
 * 
 * @Title: �������
 * @Deseription: ����Ļ����﷨
 * @author ����
 * @date 2021��8��5��
 * @version 1.0
 *
 */
public class array01 {

	public static void main(String[] args) {
//		 1.��������
		int[] arr;
		boolean[] arr1;
		String[] arr2;
		double[] arr3;

//		2.����ĳ�ʼ��
//		2.1��̬��ʼ��
		int[] array = { 10, 6, 7, 12, 32, 43 };
		System.out.println("����array��Ԫ��Ϊ:" + Arrays.toString(array));// [10, 6, 7, 12, 32, 43]

//		2.2��̬��ʼ��
//		��һ��
		int[] ar;
		ar = new int[] { 12, 5, 6, 8, 4, 2 };
		System.out.println("����ar��Ԫ��Ϊ:" + Arrays.toString(ar));// [12, 5, 6, 8, 4, 2]
//		�ڶ���
		int[] ar1 = new int[5];
		System.out.println("����ar1��Ԫ��Ϊ:" + Arrays.toString(ar1));// [0, 0, 0, 0, 0]
		boolean[] ar2 = new boolean[5];
		System.out.println("����ar2��Ԫ��Ϊ:" + Arrays.toString(ar2));// [false, false, false, false, false]

//		3.����Ԫ�صķ���
		System.out.println("����ar�ĵ�һ��Ԫ��Ϊ:" + ar[0]);// ����ar�ĵ�һ��Ԫ��Ϊ:12
		System.out.println("����ar�ĵ��ĸ�Ԫ��Ϊ:" + ar[3]);// ����ar�ĵ��ĸ�Ԫ��Ϊ:8
		System.out.println("����ar��Ԫ�ظ���Ϊ:" + ar.length);// ����ar��Ԫ�ظ���Ϊ:6

//		4.����ı���
//		a.�������
		for (int i = 0; i < ar.length; i++) {
			System.out.println("����ar��" + (i + 1) + "��Ԫ�ظ���Ϊ:" + ar[i]);
		}
//		b.�������
		for (int i = ar.length - 1; i >= 0; i--) {
			System.out.println("����ar��" + (i + 1) + "��Ԫ�ظ���Ϊ:" + ar[i]);
		}

	}

}
