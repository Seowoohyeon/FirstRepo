import java.io.*;

public class E09_PrintWriter {
	
	/*
	 	# PrintWriter
	 	
	 	  - Writer�� �ѹ� �� ���μ� ���� ��ɱ��� �߰��س��� Ŭ����
	 	  - printf(), printf() ���� �����Ǿ� �ִ�
	 	  
	 	# PrintStream
	 	  - Stream�� �ѹ� �� ���μ� ���ϰ� print�� �� �� �ִ� Ŭ����
	*/
	
	public static void main(String[] args) {
		
		
		try(
				FileOutputStream fout = new FileOutputStream(new File("./printwritertest.txt"));
				BufferedOutputStream bout = new BufferedOutputStream(fout);
				PrintWriter out = new PrintWriter(bout);
		) {
			out.println("  /)/)");
			out.println(" (  ..)");
			out.println(" ( > $)");
			out.println(123);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		
		
		
	}
	
	
	
}
