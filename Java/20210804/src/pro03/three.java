package pro03;

import java.util.Scanner;

/**
 * 
 * @Title:����������--���׼�����
 * @Deseription:
 * @author ����
 * @date 2021��8��4��
 * @version 1.0
 *
 */
public class three {

	public static void main(String[] args) {
//		1.ģ�ⴰ��
		while (true) {
//			3.��ӡ�˵���ʾ
			System.out.println("��ѡ��[1]+  [2]-  [3]*  [4] /  [-1]�˳�");
//			4.����һ������ѡ��
			int menu = getInt();
//			2.ģ��رհ�ť
			if (menu == -1) {
				System.out.println("�˳����ϵͳ��");
				break;
			}
//			5.У��˵�
			boolean isCheck = check(menu);
			if (isCheck) {
//				6.У��ͨ��������˵�
				proccess(menu);
			} else {
				System.out.println("У��ʧ�ܣ����������룡����");
			}

		}

	}

//	�Ӽ��̻�ȡ�����ֵ
	public static int getInt() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

//	У��˵�����
	public static boolean check(int menu) {
		if (menu >= 1 && menu <= 4) {
			return true;
		} else {
			return false;
		}
	}

//	���㴦��
	public static void proccess(int menu) {
		System.out.println("�������һ�����֣�");
		int a = getInt();
		System.out.println("������ڶ������֣�");
		int b = getInt();
		if (menu == 1) {
			int sum = add(a, b);
			System.out.println("��ͽ��Ϊ��" + sum);
		} else if (menu == 2) {
			int sub = sub(a, b);
			System.out.println("�p�����Ϊ��" + sub);
		} else if (menu == 3) {
			int mut = mut(a, b);
			System.out.println("�˷����Ϊ��" + mut);
		} else if (menu == 4) {
			int div = div(a, b);
			System.out.println("�������Ϊ��" + div);
		}
	}

//	�ӷ����p�����˷�����������
	public static int add(int a, int b) {
		return a + b;
	}

	public static int sub(int a, int b) {
		return a - b;
	}

	public static int mut(int a, int b) {
		return a * b;
	}

	public static int div(int a, int b) {
		return a / b;
	}

}
