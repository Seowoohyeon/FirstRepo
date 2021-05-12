import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E03_FileIO {
	
	/*
	 	# Stream
	 	  - �����͵��� ������ ���
	 	  - ���α׷����� ���� �� ����ϴ� ��θ� ��ǲ��Ʈ��
	 	  - ���α׷����� ó���� �� ���� �� ����ϴ� ��� �ƿ�ǲ��Ʈ��
	 	  
	 	# OutputStream�� ��� �޼���
	 	  
	 	  
	 	# InputStream���� �޼���
	 	  - read() : ��Ʈ������ ���� ������ �� ����Ʈ�� �о�´� EOF�� ���ٷָ� -1�� ��ȯ
	 	  - read(byte[]) : byte[]�� ���� �����ϸ� �ű⿡ ��ƿ´�
	 	  - read(byte, off, len) : byte[]�� ���� �����ϵ� ���ϴ� ��ŭ ���ϴ� ��ġ�� �д´�
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
