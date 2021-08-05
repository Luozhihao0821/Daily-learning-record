package pro04;

import java.util.*;
import java.util.Scanner;

/**
 * 
 * @Title:����߼�����Ӧ��--�˿�����Ϸ��Ŀ
 * @Deseription:
 * @author ����
 * @date 2021��8��5��
 * @version 1.0
 *
 */
public class array04 {
	static String[] pokers;//����Ϊ��Ա����

	public static void main(String[] args) {
		/**
		 * 4�ֻ�ɫ ���� ���� ���� ÷�� �ַ� 2-10 J-A �� ����\С��
		 */

//		1.ģ�����
		while (true) {
//			3.��ӡ��ʾ��Ϣ
			System.out.println("��1�������� ��2��ϴ�� ��3������ ��-1���˳���Ϸ");
//			4.�ӿ���̨��ȡһ������
			int menu = getInt();
//			2.ģ��رհ�ť
			if (menu == -1) {
				break;
			}
//			5.У��˵�
			boolean isCheck = check(menu);
			if (!isCheck) {
				System.out.println("��������Υ�������������룡����");
				continue;
			}
//			6.����˵�
			process(menu);
		}
	}

//	����˵�
	private static void process(int menu) {
		if (menu == 1) {
//			������
			pokers = create();
			System.out.println("�����Ƶ�����Ϊ��" + Arrays.toString(pokers));
		} else if (menu == 2) {
//			ϴ��
			pokers = random(pokers);
			System.out.println("ϴ���Ƶ�����Ϊ��" + Arrays.toString(pokers));
		} else if (menu == 3) {
//			����
			fetch(pokers);
		}
	}

//	����
	private static void fetch(String[] pokers) {
//		1.����������ң��ֱ���17����
		String[] p1=new String[0];
		String[] p2=new String[0];
		String[] p3=new String[0];
//		3.��������
		for (int i = 0; i < pokers.length-3; i++) {
			if(i%3==0) {
				p1=Arrays.copyOf(p1, p1.length+1);
				p1[p1.length-1]=pokers[i];
			}else if(i%3==1) {
				p2=Arrays.copyOf(p2, p2.length+1);
				p2[p2.length-1]=pokers[i];
			}else if(i%3==2) {
				p3=Arrays.copyOf(p3, p3.length+1);
				p3[p3.length-1]=pokers[i];
			}
		}
		System.out.println("���1��"+Arrays.toString(p1));
		System.out.println("���2��"+Arrays.toString(p2));
		System.out.println("���3��"+Arrays.toString(p3));
	}

//	ϴ��
	private static String[] random(String[] srcPokers) {
//		2.����һ��Ŀ������
		String[] destPokers = new String[srcPokers.length];
//		4.��ʶ����
		boolean[] flags = new boolean[srcPokers.length];
//		3.�����Ҫ��54��

		for (int i = 0; i < srcPokers.length; i++) {
//			 1.���������
			Random ran = new Random();
			int index = ran.nextInt(srcPokers.length);
//			5.��ȡ��ǰ�±�ı�ʶ
			boolean flag = flags[index];
//			6.�����ʶΪtrue����ʶ�������ѱ�ϴ��
			if (flag) {
				i--;
			} else {
				destPokers[i] = srcPokers[index];
				flags[index] = true;// ���Ƶ�Ŀ������󽫸��±�����Ϊtrue
			}

		}
		return destPokers;
	}

//	������
	private static String[] create() {
//		1.׼����ɫ
		String[] colors = { "����", "����", "÷��", "����" };
//		2.׼���ַ�
		String[] numbers = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
//		3.��������
		String[] kings = { "����", "С��" };
//		5.����Ŀ������
		String[] destPokers = new String[0];
//		4.������
		for (int i = 0; i < colors.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				destPokers = Arrays.copyOf(destPokers, destPokers.length + 1);
				destPokers[destPokers.length - 1] = colors[i] + numbers[j];
//				System.out.println(colors[i] + numbers[j]);
			}
		}
//		6.������
		destPokers = Arrays.copyOf(destPokers, destPokers.length + kings.length);
		System.arraycopy(kings, 0, destPokers, destPokers.length - kings.length, kings.length);

//		System.out.println(Arrays.toString(destPokers));
		return destPokers;
	}

//	��������
	private static int getInt() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}

//	У��˵�
	private static boolean check(int menu) {
		if (menu >= 1 && menu <= 3) {
			return true;
		}
		return false;
	}

}
