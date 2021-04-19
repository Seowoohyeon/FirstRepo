import javax.swing.JFrame;

public class B07_CharAt extends JFrame {

	public static void main(String[] args) {
		
		/*
		  	"문자열".charAt(Index);
		  	  - 해당 문자열에서 원하는 번쨰의 문자를 케릭터 타입으로 꺼내는 함수
		  	
		  	"문자열"/length();
		  	  - 해당 문자열의 길이를 정수 타입으로 알려줌
		*/
		
		System.out.println("Hello, everyone!!");
		System.out.println("Hello, everyone!!".charAt(0));
		System.out.println("Hello, everyone!!".length());
		String str = "Hello, everone!!";
		System.out.println(str.length());
		System.out.println(str.charAt(15));
		
		
		
		
		
	}

}
