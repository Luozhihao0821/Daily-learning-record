package pro06;

public class TestPerson {

	public static void main(String[] args) {
		Person p;
		p = new Person();

//		��������
		p.name = "С��";
		
//		���ʷ���
		p.a();
		
//		ʹ�� ���� ���ʾ�̬����
		Person.a = 5;


//		ʹ�� ���� ���ʾ�̬����
		Person.out();
	}

}
