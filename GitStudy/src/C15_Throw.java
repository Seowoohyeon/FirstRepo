import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class C15_Throw {

	/*
	 	# throw
	 	
	 		- 원하는 예외를 발생시킨다
	 		
	 	# throws
	 	
	 		- 해당메서드에서 이러한 예외들을 발생시킨다는 것을 알린다
	 		- 해당 메서드를 호출하는 곳에 경고를 해줄 수 있다
	 		- 예외에 대한 처리를 호출하는 곳으로 미룬다.
	 	
	 	# Exception 
	 		- 클래스를 상속받은 예외는 반드시 처리해야 하는 예외가 된다
	 		- 예외처리가 된 경우에만 컴파일을 허용해준다
	 		
	 	# RunException 클래스를 상속받은 예외는 반드시 처리하지 않아도 되는 예외가 된다
	 		- InputMismathException... 등
	 		- 예외처리를 하지 않아도 컴파일 에러는 발생하지 않는 예외들
	 		
	 */	
	public static void main(String[] args) {
	//	new C15_Throw().dangerous_method();
		C15_Throw instance = new C15_Throw();
		
		try {
			instance.dangerous_method();
			instance.dangerous_method2();
		} catch (FileNotFoundException e) {
			System.out.println("파일 못찾음");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 터짐 " + e.getMessage());
		} 
		
		try {
			instance.checkEven(20);
			instance.checkOdd(10);
		} catch (NotEvenException e) {
			System.out.println("짝수 아님 익셉션");
		} catch (NotOddException e) {
			System.out.println("홀수 아님 익셉션");
		}
		
		
		System.out.println("프로그램 정상 종료");
	}
	
	public void dangerous_method() throws FileNotFoundException {
		// 파일의 내용을 읽어오기 위한 준비 과정 (꼭 처리해야 하는 예외가 발생)
		File f = new File("C:\\Users\\sexys\\OneDrive\\바탕 화면\\우현\\ssss.txt");
			FileReader reader = new FileReader(f);
	
	}
	
	public void dangerous_method2() {
		throw new ArrayIndexOutOfBoundsException("그냥 만들었음");
	}
	
	public void checkEven(int num) throws NotEvenException {
		if(num % 2 == 0) {
			System.out.println("짝수입니다");			
		} else {
			throw new NotEvenException();
		}
		
		System.out.println("checkEven()가 정상 종료");
	}
	
	public void checkOdd(int num) {
		if(num % 2 == 1) {
			System.out.println("홀수입니다");			
		} else {
			throw new NotOddException();
		}
		
		System.out.println("checkOdd()가 정상 종료");
	}

}
// 짝수가 아닐때 발생시킬 예외 (예외처리 하지 않으면 컴파일 불가)
class NotEvenException extends Exception {
	public NotEvenException () {
		super("짝수가 아니어서 발생시킬 예외");
	}
}

//홀수가 아닐때 발생시킬 예외 (예외처리 하지 않아도 빨간줄이 뜨지 않는 예외)
class NotOddException extends RuntimeException{
	public NotOddException() {
		super("홀수가 아니어서 발생시킬 예외");
	}
}












