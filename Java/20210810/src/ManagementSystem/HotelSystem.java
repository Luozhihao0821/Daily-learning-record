package ManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelSystem {

	public static void main(String[] args) {
		// 1.ģ�ⴰ��
		while (true) {
			// 3.��ӡ�˵�
			System.out.println(
					"\n��1����ӷ��� ��2���޸ķ���״̬ ��3���޸ķ������� ��4����ѯָ��������Ϣ ��5������ ��6���˷�"
					+ "\n��7������ ��8��ÿ�շ�����ס�� ��9��ÿ�շ�������� ��10��ͳ��Ӫҵ�� ��11����ѯȫ�����з�����Ϣ"
					+ "\n��-1���˳�ϵͳ");
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
			boolean isAdd = manager.add(room);
			if (isAdd) {
				System.out.println("��ӳɹ���");
			} else {
				System.out.println("���ʧ�ܣ�");
			}
		} else if (menu == 2) {
//			�޸ķ���״̬
			System.out.println("�����뷿���ţ�");
			int id = getInt();
			System.out.println("�����뷿��״̬ ����0 ����ס1 ά��2��");
			int state = getInt();
			boolean isState = manager.modifyRoomState(id, state);
			if (isState) {
				System.out.println("�޸ĳɹ���");
			} else {
				System.out.println("�޸�ʧ�ܣ�");
			}
		} else if (menu == 3) {
//			�޸ķ�������
			System.out.println("�����뷿���ţ�");
			int id = getInt();
			System.out.println("�����뷿������ ���˷�0 ��׼��1 ����2 ��ͳ�׷�3��");
			int type = getInt();
			boolean isType = manager.modifyRoomType(id, type);
			if (isType) {
				System.out.println("�޸ĳɹ���");
			} else {
				System.out.println("�޸�ʧ�ܣ�");
			}
		} else if (menu == 4) {
//			��ѯ������Ϣ
			System.out.println("�����뷿���ţ�");
			int id = getInt();
			Room room = manager.getRoomById(id);
			System.out.println("�����ţ�" + room.id);
			System.out.println("�������ͣ�" + HotelManager.ROOM_TYPE[room.type]);
			System.out.println("����״̬��" + HotelManager.ROOM_STATE[room.state]);
			System.out.println("����۸�" + HotelManager.ROOM_PRICES[room.type] + " Ԫ");
		} else if (menu == 5) {
//			����
//			1.��ȡ���еĿ��з���
			ArrayList<Room> rooms = manager.queryByAllFree();
//			2.��ӡ���еķ�����Ϣ
			for (Room room : rooms) {
				System.out.println("������:" + room.id + " , ��������:" + room.type + "/" + HotelManager.ROOM_TYPE[room.type]
						+ " , ����״̬:" + room.state + "/" + HotelManager.ROOM_STATE[room.state]);
			}
//			3.���뷿��ID
			System.out.println("�����붩�����ţ�");
			int id = getInt();
//			4.������
			boolean isBook = manager.book(id);
			if (isBook) {
				System.out.println("Ԥ���ɹ���");
			} else {
				System.out.println("Ԥ��ʧ�ܣ�");
			}
		} else if (menu == 6) {
//			�˷�
//			1.���뷿��ID
			System.out.println("�������˷���ţ�");
			int id = getInt();
//			2.�˷�
			boolean isOut = manager.out(id);
			if (isOut) {
				System.out.println("�˷��ɹ���");
			} else {
				System.out.println("�˷�ʧ�ܣ�");
			}
		} else if (menu == 7) {
//			����
//			1.���뵱ǰ�����
			System.out.println("�����뵱ǰ�����ţ�");
			int srcId = getInt();
//			2.����Ŀ�귿���
			System.out.println("������Ŀ�귿���ţ�");
			int desId = getInt();
			boolean isChange=manager.change(srcId,desId);
			if (isChange) {
				System.out.println("�����ɹ���");
			} else {
				System.out.println("����ʧ�ܣ�");
			}
		} else if (menu == 8) {
//			ÿ�շ�����ס��
			double rate=manager.inRate();
			System.out.println("��ס�ʣ�"+(rate*100)+"%");
		} else if (menu == 9) {
//			ÿ�շ��������
			double free=manager.freeRate();
			System.out.println("�����ʣ�"+(free*100)+"%");
		} else if (menu == 10) {
//			ͳ��Ӫҵ��
			double money=manager.total();
			System.out.println("Ӫҵ�"+money+"Ԫ");
		} else if (menu == 11) {
//			��ѯȫ�����з������Ϣ
//			1.��ȡ���еĿ��з���
			ArrayList<Room> rooms = manager.queryByAllFree();
//			2.��ӡ���еķ�����Ϣ
			for (Room room : rooms) {
				System.out.println("������:" + room.id + " , ��������:" + room.type + "/" + HotelManager.ROOM_TYPE[room.type]
						+ " , ����״̬:" + room.state + "/" + HotelManager.ROOM_STATE[room.state]);
			}
		}

	}

	private static boolean check(int menu) {
		if (menu >= 1 && menu <= 11) {
			return true;
		}
		return false;
	}

	private static int getInt() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

}
