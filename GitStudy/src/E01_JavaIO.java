import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E01_JavaIO {
	
	/*
	 	# Java IO (Input, Output)
	 	
	 	  - �ڹٴ� ��Ʈ���̶�� ������ �̿��� ������Ѵ�
	 	  - ���α׷����� ������ ��� �����͵��� �Է��̶� �θ���
	 	  - ���α׷��� �����ؼ� �������� ��� �����͵��� ����̶� �θ���
	 	  
	 	# Stream
	 	  - �����͵��� ������ ���
	 	  - �Է� ���� �� �����͵��� ������ ��θ� InputStream�̶� �θ�
	 	  - ��� �� �� �����͵��� ������ ��θ� OutputStream�̶� �θ�
	 	  - �����Ͱ� Stream���� �̵��ϱ� ���ؼ��� byte Ÿ������ ��Ⱥ�ؾ� �Ѵ�
	 */
	
	public static void main(String[] args) {
		
		FileOutputStream fout = null;
		
		try {
			/*
			 	# ���� ��ο� ��� ���
			 	
			 	 - ������ : ���ϴ� �ڿ������� ��θ� ��Ʈ���� ��� ���� ��
			 	    (C:\, D:\, https://......)
			 	    
			 	  * ���� ��� ��
			 	   - D:\Pictures\animals\penguin.jpg
			 	 
			 	 - ����� : ���ϴ� �ڿ������� ��θ� ���� ��ġ���� ã�ư��� ���� ����ζ�� �Ѵ�
			 	      ��� ��δ� ./�Ǵ� ../�� ���۵ȴ� (./�� ������ �����ϴ�)
			 	   
			 	   (./) : ���� ��ġ���� ����
			 	   (./)../ : ���� ����
			 	   
			 	   * ��� ��� ��
			 	     - ./../../penguin.jpg
			 	     - ./../images/penguin.jpg
			 */
			
			fout = new FileOutputStream("./wd.txt", true);
			
			for(int i = 0; i < 10; ++i) {
				fout.write(String.format("������ ������ �� ���׿�...%d\n", i).getBytes());
			}
			//fout.close();
			System.out.println("���� ���� �Ϸ�");
		} catch (FileNotFoundException e) {
			System.out.println("���� �� ã��");
		} catch (IOException e) {
			System.out.println("�����͸� ���ٰ� ��������");
		} finally {
			try {			
				if(fout != null) fout.close();
			} catch(IOException e) {}
		} 
		
	}
}
