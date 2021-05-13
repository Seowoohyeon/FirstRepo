import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class E05_StreamToPrimitive {
	
	/*
	 	# DataInputStream/DataOutputStream
	 	
	 	  - Reader/Writer는 스트림을 문자로 손쉽게 다루시 위한 클래스였다면 DataInputStream/DataOutputStream은
	 	     기본형 타입으로 손쉽게 다루기 위한 클래스
	 */
	public static void main(String[] args) {
		File f = new File("./data/myData.data");
		try {
			FileOutputStream fo = new FileOutputStream(f);
			DataOutputStream dos = new DataOutputStream(fo);			
			
			dos.writeInt(9999);
			dos.writeInt(3000);
			dos.writeInt(850);
			dos.writeFloat(123.123f);
			dos.writeFloat(12345.1234f);
			dos.writeUTF("UTF타입으로 쓰기");
			dos.writeBoolean(false);
			
			// 사용한 스트림은 가장 최근에 만든 것 부터 차례대로 닫아줘야 한다
			// * JAVA15 기준으로는 하나만 닫아도 함께 닫힌다
			dos.close();
			fo.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		FileInputStream fin;
		DataInputStream din;
		try {
			fin = new FileInputStream(f);
			din = new DataInputStream(fin);
			
			// * writeInt로 썼던 것은 readInt로 읽어야 한다
			// 파일에 썼던 순서대로 읽으면 데이터를 다시 가져올 수 있다.
			System.out.println("아까 저장했던 첫 번쨰 int : " + din.read());
			System.out.println("아까 저장했던 두 번쨰 int : " + din.readInt());
			System.out.println("아까 저장했던 세 번쨰 int : " + din.readInt());
			System.out.println("float : " + din.readFloat());
			System.out.println("float : " + din.readFloat()); 
			System.out.println("UTF : " + din.readUTF());
			System.out.println("boolean : " + din.readBoolean());
			
			din.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
