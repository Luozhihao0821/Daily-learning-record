package pro10;
/**
 * 
 *@Title: ���������ϵ
 *@Deseription: ��ַ��
 *@author ����
 *@date 2021��8��12��
 *@version 1.0
 *
 */
public class Address {
	private String province;
	private String city;
	
	public Address(String province,String city) {
		this.province=province;
		this.city=city;
		System.out.println(province+city);
	}
}
