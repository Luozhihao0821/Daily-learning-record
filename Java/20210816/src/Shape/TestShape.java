package Shape;

public class TestShape {

	public static void main(String[] args) {
//		1.�����಻�ܱ�ʵ����
//		2.����һ��Circle
		Circle c=new Circle(100);
		System.out.println(c.getLen()); //628.3185307179587
		System.out.println(c.getArea()); //31415.926535897932

//		3.����ָ������
		Shape s=new Circle(100);
		Shape s1=new Rect(100,200);
		System.out.println(s1.getLen()); //600.0
		System.out.println(s1.getArea()); //20000.0
	}

}
