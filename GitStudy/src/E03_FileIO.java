import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E03_FileIO {
	
	/*
	 	# Stream
	 	  - 데이터들이 오가는 통로
	 	  - 프로그램으로 들어올 때 사용하는 통로를 인풋스트림
	 	  - 프로그램에서 처리된 후 나갈 때 사용하는 통로 아웃풋스트림
	 	  
	 	# OutputStream의 곹오 메서드
	 	  
	 	  
	 	# InputStream공통 메서드
	 	  - read() : 스트링으로 부터 다음의 한 바이트를 읽어온다 EOF에 도다롸면 -1을 반환
	 	  - read(byte[]) : byte[]을 만들어서 전달하면 거기에 담아온다
	 	  - read(byte, off, len) : byte[]을 만들어서 전달하되 원하는 만큼 원하는 위치에 읽는다
	 */
	
	public static void main(String[] args) {
		File git = new File("./wd.txt");
		try {
			FileInputStream fin  = new FileInputStream(git);
			while(fin.read() != -1) {
				System.out.print((char)fin.read());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(git.exists());
		System.out.println(git.isDirectory());
		System.out.println(git.isFile());
	}
	
}
