package ManagementSystem;

import java.util.Scanner;

public class HotelSystem {

	public static void main(String[] args) {
		// 1.ģ�ⴰ��
		while (true) {
			// 3.��ӡ�˵�
			System.out.println("��1����ӷ��䡾2���޸ķ���״̬��3���޸ķ������͡�4����ѯ������Ϣ��-1���˳�ϵͳ");
			// 4.�ӿ���̨��ȡһ������
			int menu = getInt();
			// 2.ģ��رհ�ť
			if (menu == -1) {
				System.out.println("�˳�ϵͳ");
				break;
			}
			// 5.У��
			boolean isCheck = check(menu);
			if (!isCheck) {
				// У��ʧ��
				System.out.println("У��ʧ�ܡ�����������");
				continue;
			}
			// У��ͨ��
			process(menu);
		}

	}

	static HotelManager manager = new HotelManager();

	private static void process(int menu) {
		if (menu == 1) {
//			��ӷ�����Ϣ
			System.out.println("�����뷿���� 0101-1689��");
			int id = getInt();
			System.out.println("�����뷿������ ���˷�0 ��׼��1 ����2 ��ͳ�׷�3��");
			int type = getInt();
			System.out.println("�����뷿��״̬ ����0 ����ס1 ά��2��");
			int state = getInt();
			Room room = new Room(id, type, state);
			boolean isAdd=manager.add(room);
			if(isAdd) {
				System.out.println("��ӳɹ���");
			}else {
				System.out.println("���ʧ�ܣ�");
			}
		} else if (menu == 2) {
//			�޸ķ���״̬
			System.out.println("�����뷿���ţ�");
			int id = getInt();
			System.out.println("�����뷿��״̬ ����0 ����ס1 ά��2��");
			int state = getInt();
			boolean isState=manager.modifyRoomState(id, state);
			if(isState) {
				System.out.println("�޸ĳɹ���");
			}else {
				System.out.println("�޸�ʧ�ܣ�");
			}
		} else if (menu == 3) {
//			�޸ķ�������
			System.out.println("�����뷿���ţ�");
			int id = getInt();
			System.out.println("�����뷿������ ���˷�0 ��׼��1 ����2 ��ͳ�׷�3��");
			int type = getInt();
			boolean isType=manager.modifyRoomType(id, type);
			if(isType) {
				System.out.println("�޸ĳɹ���");
			}else {
				System.out.println("�޸�ʧ�ܣ�");
			}
		} else if (menu == 4) {
//			��ѯ������Ϣ
			System.out.println("�����뷿���ţ�");
			int id = getInt();
			Room room=manager.getRoomById(id);
			System.out.println("�����ţ�"+room.id);
			System.out.println("�������ͣ�"+HotelManager.ROOM_TYPE[room.type]);
			System.out.println("����״̬��"+HotelManager.ROOM_STATE[room.state]);
			System.out.println("����۸�"+HotelManager.ROOM_PRICES[room.type]+" Ԫ");
		}

	}

	private static boolean check(int menu) {
		if (menu >= 1 && menu <= 4) {
			return true;
		}
		return false;
	}

	private static int getInt() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

}
