package Person;
/**
 * 
 *@Title: �̳�--����һ
 *@Deseription: Student��-�̳�Person��
 *@author ����
 *@date 2021��8��13��
 *@version 1.0
 *
 */
public class Student extends Person{
	private double score; //����
	public Student(){
		
	}
	public Student(String name, boolean gender, int age,double score) {
		this.name=name;
		this.gender=gender;
		this.age=age;
		this.score = score;
	}
	public void study() {
		System.out.println(this.name+" ����ѧϰ....");
	}
	public void exam() {
		System.out.println(this.name+" ���Է���Ϊ��"+score+" ��");
	}
}
