import java.io.*;

public class E09_PrintWriter {
	
	/*
	 	# PrintWriter
	 	
	 	  - Writer를 한번 더 감싸서 편리한 기능까지 추가해놓은 클래스
	 	  - printf(), printf() 등이 구현되어 있다
	 	  
	 	# PrintStream
	 	  - Stream을 한번 더 감싸서 편리하게 print를 할 수 있는 클래스
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
