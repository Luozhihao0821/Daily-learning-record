package Master;

public class TestPet {

	public static void main(String[] args) {
//		1.�����������
		Dog dog=new Dog();
		Cat cat=new Cat();
		Tiger tiger=new Tiger();
		
//		2.��������Ա����
		Master master=new Master();
//		dog��cat����ʵ�δ���
		master.feed(dog); //��ϲ���Թ�ͷ
		master.feed(cat); //èϲ������
		master.feed(tiger); //�ϻ�ϲ������
		
//		����***�ֲ�����***
		Pet pet=new Dog(); //��ʱpetָ��Dog����
		pet.eat(); //��ϲ���Թ�ͷ
		
		pet=new Cat(); //��ʱpetָ��Cat����
		pet.eat(); //èϲ������
	}

}
