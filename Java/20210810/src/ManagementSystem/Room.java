package ManagementSystem;

public class Room {
//	1.�����ţ�1080 1081 1082 1083 1085 1086 1087 1088 1089
	int id;
//	2.�������� ���˷�0 ��׼��1 ����2 ��ͳ�׷�3
	int type;
//	3.����״̬ ����0 ����ס1 ά��2
	int state;

//	��ʾ��������
	static int ROOM_TYPE_SINGLE = 0;
	static int ROOM_TYPE_STANDARD = 1;
	static int ROOM_TYPE_BUSSINESS = 2;
	static int ROOM_TYPE_PERSIDENT = 3;
//	��ʾ����״̬
	static int ROOM_STATE_FREE = 0;
	static int ROOM_STATE_IN = 1;
	static int ROOM_STATE_REPAIRED = 2;

	public Room() {

	}

	public Room(int i, int t, int s) {
		id = i;
		type = t;
		state = s;
	}

}
