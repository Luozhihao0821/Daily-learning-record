package Shape;

public class Rect extends Shape{
	private int length;
	private int height;
	
	public Rect() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	public Rect(int length, int height) {
		super();
		this.length = length;
		this.height = height;
	}
//	�̳г����࣬Ҫô�ǳ����࣬Ҫô�ͱ����м̳����ʵ�ַ���
	@Override
	public double getLen() {
		// TODO �Զ����ɵķ������
		return (length+height)*2;
	}

	@Override
	public double getArea() {
		// TODO �Զ����ɵķ������
		return length*height;
	}
	
}
