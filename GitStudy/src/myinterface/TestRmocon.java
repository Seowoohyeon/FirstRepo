package myinterface;

import myobj.remote.AirconditionRemocon;

// �������̽��� ���� ���յ��� ���� �ڵ带 �ۼ��� �� �ִ�.
public class TestRmocon {
	public static void main(String[] args) {
		test(new AirconditionRemocon());
	}
	public static void test(Remocon remocon) {
		remocon.change();
		remocon.down(1);
		remocon.up(0);
		remocon.power();
	}
}
