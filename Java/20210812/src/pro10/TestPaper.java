package pro10;
/**
 * 
 *@Title: ���ع���
 *@Deseription: TestPaper������
 *@author ����
 *@date 2021��8��12��
 *@version 1.0
 *
 */
public class TestPaper {
	public static void main(String[] args) {
//		3.������ѡ�����
		SingleChoice s1=new SingleChoice("1+1=?","A.1","B.2","C.3","D.4");
		SingleChoice s2=new SingleChoice("1+2=?","A.1","B.2","C.3","D.4");
		SingleChoice s3=new SingleChoice("3+1=?","A.1","B.2","C.3","D.4");
//		2.����һ����ѡ������
		SingleChoice[] singles= {s1,s2,s3};
//		1.����һ���Ծ�
		Paper p=new Paper(singles);
	}
}
