package List;

import java.util.ArrayList;

/**
 * 
 * @Title: List�ӿ���---ArrayList��
 * @Deseription: ˳���
 * @author ����
 * @date 2021��8��9��
 * @version 1.0
 *
 */
public class ArrayListDeom {

	public static void main(String[] args) {
//		1.����һ��ArrayList
		ArrayList list = new ArrayList();
//		2.API
//		2.1 ���Ԫ��
		list.add("abc");
		list.add("def");
		list.add("123");
		list.add(456);
		System.out.println(list); // [abc, def, 123, 456]
//		2.2 ָ���±�λ�ò���Ԫ��
		list.add(1, 456);
		System.out.println(list); // [abc, 456, def, 123, 456]
//		2.3 ����Ԫ�أ��±꣩
		String str = (String) list.get(0);
		System.out.println(str); // abc
//		2.4 ��Ӽ��ϵ�ָ��λ��
		list.addAll(1, list);
		System.out.println(list); // [abc, abc, 456, def, 123, 456, 456, def, 123, 456]
		
//		2.5 �������
		int index=list.indexOf("abc");
		System.out.println(index); //0
//		2.6 �������
		index=list.lastIndexOf("abc");
		System.out.println(index); //1
	}

}
