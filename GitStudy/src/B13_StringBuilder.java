
public class B13_StringBuilder {
	
	// ���ڿ��� �ٽ� �����ϴ� ����� ���ִ� Ŭ����
	
	public static void main(String[] args) {
		// ex : ���ڿ��� �Ųٷ� ����� �����غ���
		
		long st = System.currentTimeMillis();
		System.out.println("");
		
		String text = "Spring Framework";
		int a = 10000000;
		// String Ŭ������ ���� ������ �ſ� �������̴�.
		// ���� ������ ��ȿ����
		for(int j = 0; j <= a; j++) {
			String revresed_text = "";
			for(int i  =0; i < text.length(); i++) {
				revresed_text += text.charAt(text.length() - 1 - i);
			}
		}
		//System.out.println(revresed_text);
		
		long et = System.currentTimeMillis() - st;
		System.out.println("���ۿ� �ɸ� �ð� : " + et);
		
		st = System.currentTimeMillis();
		
		for(int j = 0; j <= a; j++) {
			StringBuilder reBuilder = new StringBuilder();
			for(int i = 0; i < text.length(); i++) {
				char ch = text.charAt(text.length()-1-i);
				reBuilder.append(ch);
			}
		}
		//System.out.println(reBuilder.toString());
		et = System.currentTimeMillis() - st;
		System.out.println("���ۿ� �ɸ� �ð�2 : " + et);
		
		
		
		}

}
