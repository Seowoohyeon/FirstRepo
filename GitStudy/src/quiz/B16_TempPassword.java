package quiz;

public class B16_TempPassword {

	public static void main(String[] args) {

		
		for(int i = 0; i < 4; i++) {
			char pass = ((char)(Math.random() * 35 + 48));
			if(pass > 57 && pass < 65) {
				i--;
			} else {
				System.out.print(pass);
			}
		} 
		System.out.println();
		String temp = "";
		
		for(int i = 0; i < 4; i++) {
			switch((int)(Math.random() * 2)) {
			case 0:
				temp += (char)(Math.random() * 26 + 'A');
				break;
			case 1:
				temp += (char)(Math.random() * 10 + '0');
				break;
			}
		}
		System.out.print(temp);
		System.out.println();
		
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		
		int size = 4;
		
		for(int i  = 0; i < size; i++) {
			int ran = (int)(Math.random() * chars.length());
			System.out.print(chars.charAt(ran));
		}
		System.out.println();
	
	
	
	
	
	
	
	
	}

}
