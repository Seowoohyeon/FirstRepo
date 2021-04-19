
/* 
  주석(comment)
   - 프로그래머가 하고 싶은 말을 적는것 
   - 주석은 프로그램 실행에 영향을 미치지 않는다
   - 주로 이 소스를 보게 될 다른 프로그래머들에게 전달하는 용도로 사용한다
   - 우리는 공부용
  
   이클립스 단축키 정리
   - Ctrl + [+, -] : 글자 크기 조절
   - Ctrl + F11 : Run 컴파일 및 실행
   - Alt + 방향키 : 한 줄을 마음대로 이동
   - Tab : 들여쓰기
   - Shift + Tab : 거꾸로 들여쓰기
   
 */

/** 문서화 주석(말풍선에 등장하게 되는 주석) */

// 한줄용
//빨간줄 정보랑 해결책 F2
public class A00_Hello {

	public static void main(String[] args) {

		System.out.println("┌───────────────────┐");
		System.out.println("│  1. New Game      │");
		System.out.println("│  2. Load Game	    │");
		System.out.println("│  3. Exit	    │");
		System.out.println("└───────────────────┘");
		
		//문자는 실제로는 숫자값을 가지고 있다
		System.out.println((int)'A'); //(int)의 역할 - 문자를 숫자로 보이게함
		System.out.println((char)65); //(char)의 역할 - 숫자를 문자로 보이게함
	}
}









