
public class B13_StringBuilder {
	
	// 문자열을 다시 조립하는 기능이 모여있는 클래스
	
	public static void main(String[] args) {
		// ex : 문자열을 거꾸로 뒤집어서 생성해보기
		
		long st = System.currentTimeMillis();
		System.out.println("");
		
		String text = "Spring Framework";
		int a = 10000000;
		// String 클래스는 누적 연산이 매우 느린편이다.
		// 잦은 연산은 비효율적
		for(int j = 0; j <= a; j++) {
			String revresed_text = "";
			for(int i  =0; i < text.length(); i++) {
				revresed_text += text.charAt(text.length() - 1 - i);
			}
		}
		//System.out.println(revresed_text);
		
		long et = System.currentTimeMillis() - st;
		System.out.println("제작에 걸린 시간 : " + et);
		
		st = System.currentTimeMillis();
		
		for(int j = 0; j <= a; j++) {
			StringBuilder reBuilder = new StringBuilder();
			for(int i = 0; i < text.length(); i++) {
				char ch = text.charAt(text.length()-1-i);
				reBuilder.append(ch);
			}
		}
		//System.out.println(reBuilder.toString());
		et = System.currentTimeMillis() - st;
		System.out.println("제작에 걸린 시간2 : " + et);
		
		
		
		}

}
