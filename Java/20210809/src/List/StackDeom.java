package List;

import java.util.Stack;

/**
 * 
 * @Title: List�ӿ���---Vector������--->Stackջ��
 * @Deseription: Object[]����--ջ��ԭ��// Stackջ��
 * @author ����
 * @date 2021��8��9��
 * @version 1.0
 *
 */
public class StackDeom {

	public static void main(String[] args) {
//		1.����Stack
		Stack s = new Stack();
//		2.ѹջ
		s.push("1");
		s.push("3");
		s.push("5");
		s.push("7");
		s.push("2");
		s.push("4");
		System.out.println(s); // [1, 3, 5, 7, 2, 4]
//		3.��ջ
		System.out.println(s.pop()); // 7
		System.out.println(s.pop()); // 5
		System.out.println(s.pop()); // 3
		System.out.println(s.pop()); // 1

		System.out.println(s); // [1, 3]
//		4.�ж�ջ�Ƿ�Ϊ��
		System.out.println(s.empty()); // false
//		5.����Ԫ�أ��±�λ�ã�
		int index = s.search("3");
		System.out.println(index); // 1
	}

}
