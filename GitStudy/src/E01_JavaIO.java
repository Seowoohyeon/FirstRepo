import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E01_JavaIO {
	
	/*
	 	# Java IO (Input, Output)
	 	
	 	  - 자바는 스트림이라는 개념을 이용해 입출력한다
	 	  - 프로그램으로 들어오는 모든 데이터들을 입력이라 부른다
	 	  - 프로그램이 연산해서 내보내는 모든 데이터들을 출력이라 부른다
	 	  
	 	# Stream
	 	  - 데이터들이 오고가는 통로
	 	  - 입력 받을 때 데이터들이 들어오는 통로를 InputStream이라 부름
	 	  - 출력 할 때 데이터들이 나가는 통로를 OutputStream이라 부름
	 	  - 데이터가 Stream으로 이동하기 위해서는 byte 타입으로 변횐해야 한다
	 */
	
	public static void main(String[] args) {
		
		FileOutputStream fout = null;
		
		try {
			/*
			 	# 절대 경로와 상대 경로
			 	
			 	 - 절대경로 : 원하는 자원까지의 경로를 루트부터 모두 적는 것
			 	    (C:\, D:\, https://......)
			 	    
			 	  * 절대 경로 예
			 	   - D:\Pictures\animals\penguin.jpg
			 	 
			 	 - 상대경로 : 원하는 자원까지의 경로를 현재 위치부터 찾아가는 것을 상대경로라고 한다
			 	      상대 경로는 ./또는 ../로 시작된다 (./는 생략이 가능하다)
			 	   
			 	   (./) : 현재 위치부터 시작
			 	   (./)../ : 상위 폴더
			 	   
			 	   * 상대 경로 예
			 	     - ./../../penguin.jpg
			 	     - ./../images/penguin.jpg
			 */
			
			fout = new FileOutputStream("./wd.txt", true);
			
			for(int i = 0; i < 10; ++i) {
				fout.write(String.format("오늘은 날씨가 참 좋네요...%d\n", i).getBytes());
			}
			//fout.close();
			System.out.println("파일 쓰기 완료");
		} catch (FileNotFoundException e) {
			System.out.println("파일 못 찾음");
		} catch (IOException e) {
			System.out.println("데이터를 쓰다가 문제생김");
		} finally {
			try {			
				if(fout != null) fout.close();
			} catch(IOException e) {}
		} 
		
	}
}
