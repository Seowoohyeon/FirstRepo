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
		String test = "조선일보	가정/육아	박은주	zeeny@chosun.com"
			  +	"문화일보	가정/육아	박양수	yspark@munhwa.com"
			  +	"경향신문	가정/육아	황경상	yellowpig@kyunghyang.com"
			  +	"동아일보	가정/육아	우경임	woohaha@donga.com"
			  +	"동아일보	가정/육아	정효진	wiseweb@donga.com";

		System.out.println("테스트 1 : " + test1.matches(regex));
		System.out.println("테스트 2 : " + test2.matches(regex));
		System.out.println("테스트 3 : " + test3.matches(regex));
		
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
