package Shape;

public class Circle extends Shape{
	private int r;

	public Circle(int r) {
		super();
		this.r = r;
	}
//	�̳г����࣬Ҫô�ǳ����࣬Ҫô�ͱ����м̳����ʵ�ַ���
	@Override
	public double getLen() {
		// TODO �Զ����ɵķ������
		return Math.PI*2*r;
	}

	@Override
	public double getArea() {
		// TODO �Զ����ɵķ������
		return Math.PI*r*r;
	}
	
}
