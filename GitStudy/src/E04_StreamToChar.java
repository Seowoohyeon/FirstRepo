import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class E04_StreamToChar {

	/*
		# Reader/Writer
		
		  - InputStream과 OutputStream은 데이터를 바이트 단위로 읽고 쓴다
		  - 바이트 단위로 데이터를 사용하기 때문에 원하는 타입으로의 재구성이 필요하다
		  - Reader와 Writer는 데이터를 문자 단위로 읽고 쓰는 클래스 들이다
		  - InputStream/OutputStream을 Reader/Writer로 한번 더 감싸서 사용한다
		  
		# abstract class Reader
		
		 - BufferReader, FileReder.....
		 - Stream으로 읽은 데이터를 문자로 재구성하여 프로그래머가 사용하기 편하게 해준다
		 - 문자로 합치거나 바이트로 변환할 때 사용할 인코딩 타입을 결정할 수 있다
	 */
	
	public static void main(String[] args) {
		
		System.out.println(Charset.availableCharsets());
		
		try {
			InputStreamReader in = new InputStreamReader(
					new FileInputStream(new File("./LICENSE")), Charset.forName("UTF-8"));
			
			int ch;
			while((ch = in.read()) != -1) {
				System.out.print((char)ch);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("./data/out.py"),
					Charset.forName("UTF-8"));
			out.append("print('hello, python')\n");
			out.append("if True:\n");
			out.append("\tprint('that\\'s true')\n");
			
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
