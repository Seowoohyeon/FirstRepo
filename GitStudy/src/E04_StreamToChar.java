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
		
		  - InputStream�� OutputStream�� �����͸� ����Ʈ ������ �а� ����
		  - ����Ʈ ������ �����͸� ����ϱ� ������ ���ϴ� Ÿ�������� �籸���� �ʿ��ϴ�
		  - Reader�� Writer�� �����͸� ���� ������ �а� ���� Ŭ���� ���̴�
		  - InputStream/OutputStream�� Reader/Writer�� �ѹ� �� ���μ� ����Ѵ�
		  
		# abstract class Reader
		
		 - BufferReader, FileReder.....
		 - Stream���� ���� �����͸� ���ڷ� �籸���Ͽ� ���α׷��Ӱ� ����ϱ� ���ϰ� ���ش�
		 - ���ڷ� ��ġ�ų� ����Ʈ�� ��ȯ�� �� ����� ���ڵ� Ÿ���� ������ �� �ִ�
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
