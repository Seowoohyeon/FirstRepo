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
	 	
	 	  - Reader/Writer�� ��Ʈ���� ���ڷ� �ս��� �ٷ�� ���� Ŭ�������ٸ� DataInputStream/DataOutputStream��
	 	     �⺻�� Ÿ������ �ս��� �ٷ�� ���� Ŭ����
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
			dos.writeUTF("UTFŸ������ ����");
			dos.writeBoolean(false);
			
			// ����� ��Ʈ���� ���� �ֱٿ� ���� �� ���� ���ʴ�� �ݾ���� �Ѵ�
			// * JAVA15 �������δ� �ϳ��� �ݾƵ� �Բ� ������
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
			
			// * writeInt�� ��� ���� readInt�� �о�� �Ѵ�
			// ���Ͽ� ��� ������� ������ �����͸� �ٽ� ������ �� �ִ�.
			System.out.println("�Ʊ� �����ߴ� ù ���� int : " + din.read());
			System.out.println("�Ʊ� �����ߴ� �� ���� int : " + din.readInt());
			System.out.println("�Ʊ� �����ߴ� �� ���� int : " + din.readInt());
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
