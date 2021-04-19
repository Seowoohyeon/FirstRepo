package quiz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D09_FindEmail {
	public static void main(String[] args) {
		String regex = "^[_a-zA-Z0-9-\\.]+@[\\.a-zA-Z0-9-]+\\.[a-zA-Z]+$";
		
		String test1 = "ozaki23@naver.com";
		String test2 = "o-zak-i!!!23@naver.com";
		String test3 = "oz a ki 23@naver.com";
		String test = "�����Ϻ�	����/����	������	zeeny@chosun.com"
			  +	"��ȭ�Ϻ�	����/����	�ھ��	yspark@munhwa.com"
			  +	"����Ź�	����/����	Ȳ���	yellowpig@kyunghyang.com"
			  +	"�����Ϻ�	����/����	�����	woohaha@donga.com"
			  +	"�����Ϻ�	����/����	��ȿ��	wiseweb@donga.com";

		System.out.println("�׽�Ʈ 1 : " + test1.matches(regex));
		System.out.println("�׽�Ʈ 2 : " + test2.matches(regex));
		System.out.println("�׽�Ʈ 3 : " + test3.matches(regex));
		
		Matcher matcher = Pattern.compile("[\\w]+@[\\w]+\\.(com|net|co.kr)").matcher(test);
		
		ArrayList<String> emails = new ArrayList<>();
		
		int count = 0;
		while(matcher.find()) {
			emails.add(matcher.group());
			count++;
		}
		System.out.println(count);
		
		HashSet<String> dom  = new HashSet<>();
		for(String email : emails) {
			dom.add(email.substring(email.indexOf('@')+1));
		}
		System.out.println(dom);
	}
}
