package pro10;

import java.util.Arrays;

public class TestCustom {

	public static void main(String[] args) {
//		2.����һ�������߶���
		Custom custom=new Custom("����",null);
//		1.����һ����Ʒ����
		Product pro1=new Product("����",custom);
		Product pro2=new Product("ƻ��",custom);
		Product pro3=new Product("����",custom);
//		3.��������
		Product[] ps= {pro1,pro2,pro3};
		custom.setPs(ps);
	}
}
