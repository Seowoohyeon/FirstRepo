package quiz;

public class B05_CondtionQuiz2 {

	public static void main(String[] args) {
		
		char a = 'q', b = 'b', c = '1', d = '¤¾';
		char e = '°¡', f = 'ª¢';
		System.out.println(a == 'q' || a == 'Q');
		System.out.println(b != ' ' || b != '	');
		System.out.println(c >= '0' && c <= '9');
		System.out.println((d >= 97 && d <= 122) || (d >= 65 && d <= 90));
		System.out.println((e >= 0xAC00 && e <= 0xD7A3)||(e >= 0x3131 && e <= 0x318E));
		System.out.println(f >= 3040 && f <= 309F);
		
	}

}
