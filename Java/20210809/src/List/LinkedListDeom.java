package List;

import java.util.LinkedList;

/**
 * 
 * @Title: List�ӿ���---LinkedList��
 * @Deseription: ˫����
 * @author ����
 * @date 2021��8��9��
 * @version 1.0
 *
 */
public class LinkedListDeom {

	public static void main(String[] args) {
//		1.����LinkedList
		LinkedList link = new LinkedList();
//		2.API
//		2.1 ���Ԫ��
		link.add("123");
		link.add("abc");
		link.add("456");
		link.add("def");
		link.add("789");
		System.out.println(link); // [123, abc, 456, def, 789]
//		2.2 ���Ԫ�ص�ͷ���
		link.addFirst("000");
		System.out.println(link); // [000, 123, abc, 456, def, 789]
//		2.3 ���Ԫ�ص�β���
		link.addLast("999");
		System.out.println(link); // [000, 123, abc, 456, def, 789, 999]
//		2.4 ��Ԫ��������б�����ʾ�Ķ�ջ(�ŵ������ײ�)
		link.push("3");
		System.out.println(link); // [3, 000, 123, abc, 456, def, 789, 999]
//		2.5 �Ƴ������ش��б�ĵ�һ��Ԫ��
		link.removeFirst();
		System.out.println(link); // [000, 123, abc, 456, def, 789, 999]
//		2.6 �Ƴ������ش��б�����һ��Ԫ��
		link.removeLast();
		System.out.println(link); // [000, 123, abc, 456, def, 789]
//		2.7 �Ӵ��������ʾ�Ķ�ջ������һ��Ԫ��
		link.poll();
		System.out.println(link); // [123, abc, 456, def, 789]
//		2.8 ��ȡָ���±��Ԫ��
		Object str = link.get(2);
		System.out.println(str); // 456
//		2.9 ��ȡ��һ��Ԫ��
		System.out.println(link.getFirst()); // 123
//		2.10 ��ȡ���һ��Ԫ��
		System.out.println(link.getLast()); // 789
	}

}
