package pro10;
/**
 * 
 *@Title: ˫�����
 *@Deseription: Customer��
 *@author ����
 *@date 2021��8��12��
 *@version 1.0
 *
 */
public class Custom {
	private String name;
	private Product[] ps;
	public Custom(String name, Product[] ps) {
		this.name = name;
		this.ps = ps;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Product[] getPs() {
		return ps;
	}
	public void setPs(Product[] ps) {
		this.ps = ps;
	}
	
}
