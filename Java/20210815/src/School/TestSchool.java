package School;

public class TestSchool {

	public static void main(String[] args) {
////		1.�������ѧ������
//		Student[] stus= {new Student(),new Student(),new Student(),new Student()};
////		2.���������ʦ����
//		Teacher[] teas= {new Teacher(),new Teacher(),new Teacher(),new Teacher()};
////		3.����һ��ѧУ����
//		School sc=new School(stus, teas);
		
		Person[] per= {new Student(),new Teacher(),new Student(),new Teacher(),new Student(),new Teacher()};
		School sc=new School(per);
	}

}
