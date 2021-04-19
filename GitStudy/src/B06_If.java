
public class B06_If {

	public static void main(String[] args) {	
		/*
		  if 문
		  	- ()괄호 안에 값이 참일 때 {}안에 내용을 실행한다
		  	- ()괄호 안에 값이 거짓일 때 {}안에 내용을 무시한다
		  	
		  	
		*/
		char a = 'A';
		if(a >= 0xAC00 && a <= 0xD7FB) {
			System.out.println("한국인");
		} else if(a >= 0x3041 && a <= 0x3096) {
			System.out.println("일본인"); 	
		} else {
			System.out.println("누구세요");
		}
				
	}

}
