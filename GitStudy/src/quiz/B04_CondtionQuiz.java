package quiz;

public class B04_CondtionQuiz {

	public static void main(String[] args) {
		
		int a = 15, b = 2, c = 14, hour = 13, d = -30, e = 0, year = 2020;
		int msu = 16, csu =14;
		int msuBday = 4, csuBday = 1;
		boolean powerOn = false;
		String str = "yes";
		System.out.println("10 < a > 20  : " + (a > 10 && a < 20));
		System.out.println("b�� ¦���� ��  : " + (b % 2 == 0));
		System.out.println("c�� 7�� ����� ��  : " + (c % 7 == 0));
		System.out.println("hour�� 0�̸� 24�̻� x, 12�̻�  : " + (hour > 0 && hour >= 12 && hour <= 24));
		System.out.println("d,e�� ���̰� 30�϶�  : " + (e - d == 30 || e - d == -30));
		System.out.println("400 or 4�� ������ �������� 100���� ������ �������� ������  : " + ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)));
		System.out.println("�μ��� ö������ 2�� ���� ��  : " + (msu - csu == 2));
		System.out.println("�μ��� ö������ ������ 3���� ���� ��  : " + (msuBday - csuBday == 3));
		System.out.println("powerOn�� false�� �� true  : " + !powerOn);
		System.out.println("str�� yes�� �� true  : " + str == "yes");
		//��� ������ Ÿ���� == ���� ���ϸ� �ȵȴ�
		//������ Ÿ���� ���� �� �Ҷ��� equals�޼��� �̿�
		System.out.println(str.equals("yes"));
		//�⺻�� Ÿ���� ���� �������� ũ�⸦ �����ϱ� ����
		//(�������� ���̴� �޸𸮸� ���, ����)
		//������ Ÿ���� ���� �������� ũ�⸦ �����ϱ� �����
		//(�������� �� ���� �޸𸮸� ���, ��)
		
		String str1 = "yes";
		String str3 = "yes";
		String str2 = new String("yes");
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1 == str3 : " + (str1 == str3));
	}

}
