package pro04;

import java.util.Arrays;

/**
 * 
 * @Title: ����߼�����
 * @Deseription:
 * @author ����
 * @date 2021��8��5��
 * @version 1.0
 *
 */
public class array03 {

	public static void main(String[] args) {
//		1.����ĸ�ֵ
		System.out.print("1.����ĸ�ֵ\n");
		int[] arr = { 1, 3, 5, 7, 9 };
		int[] arr1 = arr;
		System.out.println("1����arrΪ��" + arr);
		System.out.println("2����arr1Ϊ��" + arr1);
		System.out.println("�޸�ǰarr" + Arrays.toString(arr));
		System.out.println("�޸�ǰarr1" + Arrays.toString(arr1));

		arr1[2] = 33;
		System.out.println("3����arrΪ��" + arr);
		// 4 ����arr1Ϊ��[I@123a439b --(1-4��ַ����ͬ����Ϊ�������������ͣ���ָ��ͬһ����ַ)
		System.out.println("4����arr1Ϊ��" + arr1);
		System.out.println("�޸ĺ�arr" + Arrays.toString(arr));// �޸ĺ�arr[1, 3, 33, 7, 9]
		// �޸ĺ�arr1[1, 3, 33, 7, 9] --���޸�һ�������ж��仯����Ϊ���޸ĵ���ͬһ����ַ��������ݣ�
		System.out.println("�޸ĺ�arr1" + Arrays.toString(arr1));

//		2.����ĸ���
		System.out.print("\n2.����ĸ���\n");
//		2.1ʹ��forѭ���������Ŀ���
		int[] arra = { 1, 2, 3, 4, 5};
		int[] arra1;// ���鶨��
		arra1 = new int[arra.length];// ���ٿռ�
		for (int i = 0; i < arra.length; i++) {
			arra1[i]=arra[i];
		}
		System.out.println("arra1Ϊ��"+Arrays.toString(arra1));//[1, 2, 3, 4, 5]
//		2.2ʹ��API--System.arraycopy()������鿽��
//		ԭ����
		int[] srcArray= {200,500,400,100};
//		Ŀ������
		int[] destArray=new int[srcArray.length];
//		Ӧ��System.arraycopy(src1, 0, src2, 0, 0);������src1������src2
		System.arraycopy(srcArray, 0, destArray, 0, srcArray.length);
		System.out.println("destArrayΪ��"+Arrays.toString(destArray));
//		2.3ʹ��API--Arrays.copyOf()������鿽��
//		ԭ����
		int[] src= {300,600,700,200};
//		Ŀ������
		int[] dest=Arrays.copyOf(src,src.length);
		System.out.println("destΪ��"+Arrays.toString(dest));//destΪ��[300, 600, 700, 200]
		
//		����Ҫ��Ԫ��������
		src=Arrays.copyOf(src,src.length+1);
		System.out.println("src����Ϊ��"+Arrays.toString(src));//src����Ϊ��[300, 600, 700, 200, 0]
		src[src.length-1]=123;
		System.out.println("src���ݺ�ֵΪ��"+Arrays.toString(src));//src���ݺ�ֵΪ��[300, 600, 700, 200, 123]
//		��������
		src=Arrays.copyOf(src,src.length-1);
		System.out.println("src����Ϊ��"+Arrays.toString(src));//src����Ϊ��[300, 600, 700, 200]
	}

}
