package three;

public class three {

	public static void main(String[] args) {
		// ��������

//		1.�����������ͣ�byte��short��int��long��float��double��char��boolean
		// 1.byte
		System.out.println("�������ͣ�byte ������λ����" + Byte.SIZE);
		System.out.println("��װ�ࣺjava.lang.Byte");
		System.out.println("��Сֵ��Byte.MIN_VALUE=" + Byte.MIN_VALUE);
		System.out.println("���ֵ��Byte.MAX_VALUE=" + Byte.MAX_VALUE);
		System.out.println();

		// 2.short
		System.out.println("�������ͣ�short ������λ����" + Short.SIZE);
		System.out.println("��װ�ࣺjava.lang.Short");
		System.out.println("��Сֵ��Short.MIN_VALUE=" + Short.MIN_VALUE);
		System.out.println("���ֵ��Short.MAX_VALUE=" + Short.MAX_VALUE);
		System.out.println();

		// 3.int
		System.out.println("�������ͣ�int ������λ����" + Integer.SIZE);
		System.out.println("��װ�ࣺjava.lang.Integer");
		System.out.println("��Сֵ��Integer.MIN_VALUE=" + Integer.MIN_VALUE);
		System.out.println("���ֵ��Integer.MAX_VALUE=" + Integer.MAX_VALUE);
		System.out.println();

		// 4.long
		System.out.println("�������ͣ�long ������λ����" + Long.SIZE);
		System.out.println("��װ�ࣺjava.lang.Long");
		System.out.println("��Сֵ��Long.MIN_VALUE=" + Long.MIN_VALUE);
		System.out.println("���ֵ��Long.MAX_VALUE=" + Long.MAX_VALUE);
		System.out.println();

		// 5.float
		System.out.println("�������ͣ�float ������λ����" + Float.SIZE);
		System.out.println("��װ�ࣺjava.lang.Float");
		System.out.println("��Сֵ��Float.MIN_VALUE=" + Float.MIN_VALUE);
		System.out.println("���ֵ��Float.MAX_VALUE=" + Float.MAX_VALUE);
		System.out.println();

		// 6.double
		System.out.println("�������ͣ�double ������λ����" + Double.SIZE);
		System.out.println("��װ�ࣺjava.lang.Double");
		System.out.println("��Сֵ��Double.MIN_VALUE=" + Double.MIN_VALUE);
		System.out.println("���ֵ��Double.MAX_VALUE=" + Double.MAX_VALUE);
		System.out.println();

		// 7.char
		System.out.println("�������ͣ�char ������λ����" + Character.SIZE);
		System.out.println("��װ�ࣺjava.lang.Character");
		// ����ֵ��ʽ�������ַ���ʽ��Character.MIN_VALUE���������̨
		System.out.println("��Сֵ��Character.MIN_VALUE=" + (int) Character.MIN_VALUE);
		// ����ֵ��ʽ�������ַ���ʽ��Character.MAX_VALUE���������̨
		System.out.println("���ֵ��Character.MAX_VALUE=" + (int) Character.MAX_VALUE);
		
//		8.Boolean
		boolean one = true;
		
//		2.�����������ͣ���class���ӿ�interface������[]
		
//		3.��������ת��
		int a=10;
		long b=a;
		System.out.println(b);//10
		
		byte c=(byte)128;
		System.out.println(c);//-128
	}
}
