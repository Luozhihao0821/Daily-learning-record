package pro06;
/**
 * 
 * @Title: User������TestUser
 * @Deseription:
 * @author ����
 * @date 2021��8��8��
 * @version 1.0
 *
 */
public class TestUser {

	public static void main(String[] args) {
//		1.����һ��User���󲢳�ʼ��
		User u = new User();
		System.out.println(u.age);//10
		User u1 = new User("admin", "123456", true, 23, "2021-08-08");//// admin123456true232021-08-08 �вι��췽���������ˣ�
		u1.login();//// admin ���ڵ�½��
	}

}
