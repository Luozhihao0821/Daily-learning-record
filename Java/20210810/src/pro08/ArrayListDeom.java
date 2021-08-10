package pro08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * 
 * @Title: ���ϵı���
 * @Deseription:
 * @author ����
 * @date 2021��8��10��
 * @version 1.0
 *
 */
public class ArrayListDeom {

	public static void main(String[] args) {
//		1.����һ������
		ArrayList list = new ArrayList();

//		2.���Ԫ��
		list.add(1);
		list.add(2);
		list.add(3);
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println("��������Ϊ��" + list);

//		3.ʹ�� forѭ�� ʵ�ֱ���
		for (int i = 0; i < list.size(); i++) {
			Object str = list.get(i);
			System.out.println(str);// 1 2 3 a b c
		}

//		4.ʹ�õ������������� Iterator ʵ�ֱ���
//		4.1 ��ȡ������
		Iterator it = list.iterator();
//		4.2 �ж���һ��Ԫ���Ƿ����
		boolean isNext = it.hasNext();
		System.out.println(isNext); // true
//		4.3 ��ȡnextԪ������
		Object str1 = it.next();
		System.out.println(str1); // 1
//		4.4 ��������
		Iterator it1 = list.iterator();
		while (it1.hasNext()) {
			Object str2 = it1.next();
			System.out.println(str2); // 1 2 3 a b c
		}

//		5.ʹ�� forEach ��������
		for (Object obj : list) {
			Object str3 = obj;
			System.out.println(str3); // 1 2 3 a b c
		}

//		6.��������--����������ɾ��ĳԪ��
		ListIterator it2 = list.listIterator();
		while (it2.hasNext()) {
			Object str4 = it2.next();
			if (str4.equals("a")) {
				it2.remove();
				continue;
			}
			System.out.println(str4); //// 1 2 3 b c
		}
		System.out.println(list); // [1, 2, 3, b, c]
	}

}
