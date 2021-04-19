package quiz;

import java.util.Scanner;

import myobj.tong.Barrel;

public class C07_PirateGame {
	
	Scanner sc;
	
	Barrel barrel;
	int mode;
	
	int turn;
	int nump;
	
	public C07_PirateGame(int mode) {
		this.barrel = new Barrel(10);
		this.mode = mode;
		this.nump = 2;
		this.sc = new Scanner(System.in);
	}
	
	public C07_PirateGame(int mode, int nump) {
		this(mode);
		this.nump = nump;
	}
	
	public void start() {
		switch(this.mode) {
		case 0: 
			pvp();
			break;
		case 1: 
			pvc();
			break;
		default: 
			System.out.println("���� x");
			break;
		}
	}
	
	public void config(int mode) {
		this.mode = mode;
	}
	
	
	
	void pvp() {
		while(true) {
			System.out.println(turn + 1 + "�� > ");
			System.out.print("'�÷��̾�" + (turn % nump + 1) + " '�� ���� ");
			int slot = sc.nextInt();
			if(barrel.fork(slot)) {
				if(barrel.checkGameOver()) {
					System.out.println("��������� ���ư����ϴ�");
					System.out.println("'�÷��̾�" + (turn % nump + 1) + " '�� ��� ");
					break;
				}
				turn++;
			}
		}
	}
	
	void pvc() {
		while(true) {
			System.out.println(turn + 1 + "�� > ");
			System.out.print("'�÷��̾�" + (turn % nump + 1) + " '�� ���� ");
			int slot = sc.nextInt();
			if(barrel.fork(slot)) {
				if(barrel.checkGameOver()) {
					System.out.println("��������� ���ư����ϴ�");
					System.out.println("'�÷��̾�" + (turn % nump + 1) + " '�� ��� ");
					break;
				}
				turn++;
			}
		}
	}
	
	
	public static void main(String[] args) {
		C07_PirateGame testGame = new C07_PirateGame(99, 3);
		
		testGame.start();
		testGame.config(0);
		testGame.start();
		
		System.out.println("�׽�Ʈ ���� ��");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}