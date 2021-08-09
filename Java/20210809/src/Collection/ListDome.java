package Collection;

import java.util.List;
import java.util.ArrayList;

/**
 * 
 * @Title: List �ӿ�
 * @Deseription:
 * @author ����
 * @date 2021��8��9��
 * @version 1.0
 *
 */
public class ListDome {

	public static void main(String[] args) {
//		1.����һ��List����
		List list = new ArrayList();
//		2.API
//		2.1 ���Ԫ��
		list.add("abc");
		list.add("def");
		list.add("123");
		list.add(456);
		System.out.println(list); // [abc, def, 123, 456]
//		2.2 ��ָ��Ԫ�ز��뵽ָ��λ��
		list.add(1, "789");
		System.out.println(list); // [abc, 789, def, 123, 456]
//		2.3 �Ƴ�ָ��λ�õ�Ԫ��
		list.remove(2);
		System.out.println(list); // [abc, 789, 123, 456]
//		2.4 ����ָ��λ��Ԫ��
		list.set(1, "111");
		System.out.println(list); // [abc, 111, 123, 456]
//		2.5 ����ָ��λ��Ԫ��
		Object obj = list.get(2);
		System.out.println(obj); // 123
//		2.6 �����±����Ԫ�ض���
		Object obj1 = list.indexOf(2);
		System.out.println(obj); // 123
//		2.7 ��ȡһ������
		List list1 = list.subList(1, 3);
		System.out.println(list1); // [111, 123]
	}

}
