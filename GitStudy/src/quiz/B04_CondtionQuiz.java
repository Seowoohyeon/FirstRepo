package quiz;

public class B04_CondtionQuiz {

	public static void main(String[] args) {
		
		int a = 15, b = 2, c = 14, hour = 13, d = -30, e = 0, year = 2020;
		int msu = 16, csu =14;
		int msuBday = 4, csuBday = 1;
		boolean powerOn = false;
		String str = "yes";
		System.out.println("10 < a > 20  : " + (a > 10 && a < 20));
		System.out.println("b가 짝수일 때  : " + (b % 2 == 0));
		System.out.println("c가 7의 배수일 때  : " + (c % 7 == 0));
		System.out.println("hour가 0미만 24이상 x, 12이상  : " + (hour > 0 && hour >= 12 && hour <= 24));
		System.out.println("d,e가 차이가 30일때  : " + (e - d == 30 || e - d == -30));
		System.out.println("400 or 4로 나누어 떨어지고 100으로 나누어 떨어지지 않을때  : " + ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)));
		System.out.println("민수가 철수보다 2살 많을 때  : " + (msu - csu == 2));
		System.out.println("민수가 철수보다 생일이 3개월 빠를 때  : " + (msuBday - csuBday == 3));
		System.out.println("powerOn이 false일 때 true  : " + !powerOn);
		System.out.println("str이 yes일 때 true  : " + str == "yes");
		//모든 참좋형 타입은 == 으로 비교하면 안된다
		//참조형 타입의 값을 비교 할때는 equals메서드 이용
		System.out.println(str.equals("yes"));
		//기본형 타입은 내부 데이터의 크기를 예측하기 쉬움
		//(차곡차곡 쌓이는 메모리를 사용, 스텍)
		//참조형 타입은 내부 데이터의 크기를 예측하기 어려움
		//(여기저기 막 쓰는 메모리를 사용, 힙)
		
		String str1 = "yes";
		String str3 = "yes";
		String str2 = new String("yes");
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1 == str3 : " + (str1 == str3));
	}

}
