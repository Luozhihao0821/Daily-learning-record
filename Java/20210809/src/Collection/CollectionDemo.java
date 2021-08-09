package Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 
 * @Title:������--Collection �ܴ洢������󣬳����ǿ��Ըı�ģ�����Ԫ�ص����Ӷ����ӣ�����Ԫ�صļ��ٶ�����
 * @Deseription:Collection Ϊ������鳤�ȹ̶������
 * @author ����
 * @date 2021��8��9��
 * @version 1.0
 *
 */
public class CollectionDemo {

	public static void main(String[] args) {
//		1.����һ������
		Collection c = new ArrayList();
//		2.API
//		2.1 ���Ԫ��
		c.add("123");
		c.add(true);
		c.add(1);
		System.out.println("ɾ��֮ǰ��" + c); // ɾ��֮ǰ��[123, true, 1]
//		2.2 ɾ��ָ������
		c.remove(true);
		System.out.println("ɾ��֮��" + c); // ɾ��֮��[123, 1]
//		2.3 ����Ԫ�ظ���
		System.out.println("Ԫ�ظ�����" + c.size()); // 2
//		2.4 �ж��Ƿ��������
		boolean isContains = c.contains(1);
		System.out.println(isContains); // true
//		2.5 ��ռ���
		c.clear();
		System.out.println(c); // []

	}

}
