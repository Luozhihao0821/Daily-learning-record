package ManagementSystem;

import java.util.ArrayList;

//	������ 1080 1081 1082 1083 1085 1086 1087 1088 1089 
// 		   1180 1181 1182 1183 1185 1186 1187 1188 1189
//	 	   1280 1281 1282 1283 1285 1286 1287 1288 1289
//		   1380 1381 1382 1383 1385 1386 1387 1388 1389
//	10¥��11¥ ���˷�
//	12¥��13¥ ��׼��
//	0 6 9 ����
//	8 ��ͳ�׷�

public class HotelManager {
//	1.���Զ������
	ArrayList<Room> rooms;
//	2.���ּ۸� �������� ���˷�0 ��׼��1 ����2 ��ͳ�׷�3
	static int[] ROOM_PRICES = { 188, 388, 688, 1088 };
//	3.��������
	static String[] ROOM_TYPE = { "���˷�", "��׼��", "����", "��ͳ�׷�" };
//	4.����״̬
	static String[] ROOM_STATE = { "����", "����ס", "����ά��" };

	public HotelManager() {
//		1.��ʼ��
		init();
	}

//	��ʼ��
	public void init() {
		System.out.println("\n\t\t\t<=== �� �� �� �� �� �� ϵ ͳ ===>");
//		a ��������
		rooms = new ArrayList<>();
//		b �����������
		for (int i = 0; i <= 300; i += 100) {
			for (int index = 1080 + i; index <= 1089 + i; index++) {
				if (index % 10 == 4) {
					continue;
				}
//				�жϵ��˷��ͱ�׼��
				if (index / 100 == 10 || index / 100 == 11) {
					Room room = new Room(index, Room.ROOM_TYPE_SINGLE, Room.ROOM_STATE_FREE);
					rooms.add(room);
				} else if (index / 100 == 12 || index / 100 == 13) {
					Room room = new Room(index, Room.ROOM_TYPE_STANDARD, Room.ROOM_STATE_FREE);
					rooms.add(room);
				}
			}
		}
//		c ��������
		for (Room room : rooms) {
			int id = room.id;
			if (id % 10 == 0 || id % 10 == 6 || id % 10 == 9) {
				room.type = Room.ROOM_TYPE_BUSSINESS; // ȷ��Ϊ����
			} else if (id % 10 == 8) {
				room.type = Room.ROOM_TYPE_PERSIDENT; // ȷ��Ϊ��ͳ�׷�
			}
		}

//		for (Room room : rooms) {
//			System.out.println("�����ţ�" + room.id + " , ��������" + room.type + "/" + HotelManager.ROOM_TYPE[room.type]
//					+ " , ����״̬" + room.state + "/" + HotelManager.ROOM_STATE[room.state]);
//		}
	}

//	��ӷ���
	public boolean add(Room room) {
//		1.�жϷ������Ƿ��ظ�
		for (Room rm : rooms) {
			if (room.id == rm.id) {
				return false;
			}
		}
//		2.���Ԫ��
		rooms.add(room);
		return true;
	}

//	�޸ķ���״̬
	public boolean modifyRoomState(int id, int state) {
//		1.��ȡ�������Ƿ���ڸ÷���
		Room room = null;
		for (Room rm : rooms) {
			if (id == rm.id) {
				room = rm;
				break;
			}
		}
//		2.�޸ķ���״̬
		if (room != null) {
			room.state = state;
			return true;
		}
		return false;
	}

//	�޸ķ�������
	public boolean modifyRoomType(int id, int type) {
//		1.��ȡ�������Ƿ���ڸ÷���
		Room room = null;
		for (Room rm : rooms) {
			if (id == rm.id) {
				room = rm;
				break;
			}
		}
//		2.�޸ķ�������
		if (room != null) {
			room.type = type;
			return true;
		}
		return false;
	}

//	��ѯ������Ϣ
	public Room getRoomById(int id) {
		for (Room rm : rooms) {
			if (id == rm.id) {
				return rm;
			}
		}
		return null;
	}

//	����

//	��ѯ���еĿ��з���
	public ArrayList<Room> queryByAllFree() {
//		2.����һ�����ϱ�����з������
		ArrayList<Room> freeRooms = new ArrayList<>();
//		1.��������
		for (Room room : rooms) {
			if (room.state == Room.ROOM_STATE_FREE) {
				freeRooms.add(room);
			}
		}
		return freeRooms;
	}

//	������-->����ס
	public boolean book(int id) {
		for (Room room : rooms) {
			if (room.id == id) {
				room.state = Room.ROOM_STATE_IN;
				return true;
			}
		}
		return false;
	}

//	�˷�
	public boolean out(int id) {
		for (Room room : rooms) {
			if (room.id == id) {
				room.state = Room.ROOM_STATE_FREE;
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

//	����
	public boolean change(int srcId, int desId) {
//		1.�˷���
		boolean isOut = out(srcId);
//		2.������
		boolean isBook = book(desId);
//		3.�ж�
		return isOut && isBook;
	}

//	��ס��
	public double inRate() {
//		1.�ܷ�����
		int all = rooms.size();
//		2.��ס������
		int sum = 0;
		for (Room room : rooms) {
			if (room.state == Room.ROOM_STATE_IN) {
				sum++;
			}
		}
//		3.������ס��
		return sum * 1.0 / all;
	}

//	������
	public double freeRate() {
//		1.�ܷ�����
		int all = rooms.size();
//		2.���з�����
		int sum = 0;
		for (Room room : rooms) {
			if (room.state == Room.ROOM_STATE_FREE) {
				sum++;
			}
		}
//		3.������ס��
		return sum * 1.0 / all;
	}

//	ͳ��Ӫҵ��
	public double total() {
		double moneys = 0.0;
		for (Room room : rooms) {
			if (room.state == Room.ROOM_STATE_IN) {
				moneys += HotelManager.ROOM_PRICES[room.type];
			}
		}
		return moneys;
	}

}
