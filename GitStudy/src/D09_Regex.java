

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D09_Regex {
	/*
	 	# ����ǥ���� (Regular Expression)
	 	  - ���ڿ��� ������ ǥ���ϴ� ǥ����
	 	  - Ư�� ���α׷��� �� ���ӵ��� �ʴ´�
	 	  - ���α׷��Ӱ� ���ϴ� ���ڿ� ���ϰ� ��ġ�ϴ��� �˻���� ����Ѵ�
	 	  
	 	# Pattern Ŭ����
	 	  - ����ǥ������ �ٷ�� Ŭ����
	 	  
	 	# Matcher Ŭ����
	 	  - ���� �ν��Ͻ��� �̿��Ͽ� ���ڿ��� �˻��� �� ����ϴ� Ŭ����
	 */
	
	public static void main(String[] args) {
		// Pattern.matches(regex, input) : input�� regex�� ��ġ�Ǵ� 
		// ���ڿ������� �˻����ִ� �޼���
		System.out.println(Pattern.matches("sleep", "sleep"));
		
		// [] : �ش� ��ġ�� �� ���ڿ� � ���ڵ��� �� �� �ִ��� �����ϴ� ǥ����
		System.out.println(Pattern.matches("s[lh@]eep", "sleep"));
		System.out.println(Pattern.matches("s[lh@]eep", "sheep"));
		System.out.println(Pattern.matches("s[lh@]eep", "s@eep"));
		
		/*
		  [] ���ο� ������ �� �ִ� �͵�
		    
		    1. abc  : �ش� �ڸ��� a or b or c ���
		    2. ^abc : �ش� �ڸ��� abc�� ������ ������ ���
		    3. a-z  : a ���� z���� ��� ���
		    4. &&   : ������
		  
		 */
		
		System.out.println(Pattern.matches("s[^lh@]eep", "s!eep"));
		System.out.println(Pattern.matches("s[0-9]eep", "s0eep"));
		System.out.println(Pattern.matches("s[0-9a-z]eep", "s0eep"));
		System.out.println(Pattern.matches("s[a-d&&c-f]eep", "sceep"));
		System.out.println(Pattern.matches("s[a-d&&c-f]eep", "sfeep"));
		
		Pattern instance = Pattern.compile("[0-9]@[0-9]");
		
		/*
		 ���� ���ڸ� ��Ÿ���� �͵�
		 	
		 	1.  . : ��� ���� �� [] �ۿ� ��� ��� ����
		 	2. \d : ��� ����
		 	3. \D : ���ڸ� ������ ��� ��
		 	4. \s : ��� ���� (\t, \n .. ���� ��� �����)
		 	5. \S : ������ ������ ��� ��
		 	6. \w : �Ϲ����� ���ڵ��� ��� [a-zA-Z0-9_]
		 	7. \W : �Ϲ����� ���ڵ��� ������ ������ ���
		 */
		System.out.println(Pattern.matches("s.eep", "s!eep")); // ��繮��
		System.out.println(Pattern.matches("s[.]eep", "s!eep")); // .�� ���
		System.out.println(Pattern.matches("s\\.eep", "s!eep")); // .�� ���
		
		System.out.println(Pattern.matches("s\\deep", "s9eep"));
		System.out.println(Pattern.matches("\\D\\D\\D", "cat"));
		
		System.out.println(Pattern.matches("s\\seep", "s eep"));
		System.out.println(Pattern.matches("s\\seep", "s\neep"));
		System.out.println(Pattern.matches("s\\seep", "s\teep"));
		System.out.println(Pattern.matches("s\\seep", "s\reep"));
		System.out.println(Pattern.matches("s\\seep", "sleep"));
		
		System.out.println(Pattern.matches("s\\Sep", "s eep"));
		
		/*
		 	�ش� ������ ����� ������ ������ �����ϴ� ���
		 	
		 	  1. [ex]{n} : {}���� ������ n�� ��ġ�ؾ� �Ѵ�
		 	  2. [ex]{n, m} : {} ���� ������ �ּ� n�� �̻� �ִ� m��(m����) ���� ��ġ�ؾ� �Ѵ�
		 	    * ����ǥ���Ŀ� {n, m}ó�� ������ ������ �ȵȴ�
		 	  3. [ex]{n,} : {} ���� ������ �ּ� n�� �̻� ��ġ�ؾ��Ѵ�
		 	  4. [ex]? : 0�� �Ǵ� �ѹ�
		 	  5. [ex]+ : �ּ� �ѹ� �̻�
		 	  6. [ex]* : 0�� �Ǵ� ������
		 */
		int _ = 1;
		System.out.println("�߸���;; : " +_);
		System.out.println(Pattern.matches("[\\D3-5]{5}\\.txt", "34534.txt"));
		System.out.println(Pattern.matches("[\\D3-5]{2,5}\\.txt", "34534.txt"));
		System.out.println(Pattern.matches("[��-�R]{2,}\\.txt", "�ȳ�.txt"));
		System.out.println(Pattern.matches("[��-�R]{2,}\\.txt", "�ȳ��ϼ���.txt"));
		System.out.println(Pattern.matches("[��-�R]{2,}\\.txt", "Hello.txt"));
		
		System.out.println(Pattern.matches(".{2,}\\.txt", "Hello.txt"));
		
		String regex1 = String.format(".{%d}\\.txt", 2);
		System.out.println(Pattern.matches(regex1, "abcd.txt"));

		System.out.println(Pattern.matches("[��-�R]?\\.txt", ".txt"));
		System.out.println(Pattern.matches("[��-�R]?\\.txt", "��.txt"));
		System.out.println(Pattern.matches("[��-�R]?\\.txt", "�ѱ�.txt"));

		// ��ȭ��ȣ ����ǥ����
		System.out.println(Pattern.matches("0\\d{3}-?\\d{3,4}-?\\d{4}", "01012341234"));
		System.out.println(Pattern.matches("0\\d{3}-?\\d{3,4}-?\\d{4}", "0101234123"));
		System.out.println(Pattern.matches("0\\d{3}-?\\d{3,4}-?\\d{4}", "010-1234-1234"));
		System.out.println(Pattern.matches("0\\d{3}-?\\d{3,4}-?\\d{4}", "010-123-4234"));
		
		// �ڹٿ��� ����ϴ� �������� �˻��� �� �ִ� ����ǥ���� �����
		System.out.println(Pattern.matches("[$\\w&&\\D&&\\S][\\S&&\\w$]{1,}", ""));
		
		/* 
		 	# Pattern.compile
			  - ������ ����ǥ������ �ؼ��Ͽ� Pattaern �ν��Ͻ��� �����ϰ� ��ȯ�Ѵ�
			  - Pattern Ÿ�� �ν��Ͻ��� �䱸�ϴ� ���� ����� �� �ִ�
			
			# split() : �����ϵ� ���� �ν��Ͻ��� ���ڿ� split()�� ����
			
			# matcher() : Matcher �ν��Ͻ��� �����Ͽ� ��ȯ�Ѵ�
		 */
		
		String fruit_text = "apple/banana/orange/grape/peach/mango/pineapple";
		
		Pattern regex = Pattern.compile("/");
		
		String[] fruits = regex.split(fruit_text);
		
		System.out.println(Arrays.toString(fruits));
		
		Pattern regex2 = Pattern.compile("[a-zA-Z]+");
		
		Matcher matcher = regex2.matcher(fruit_text);
		
		while(matcher.find()) {
			System.out.println("ã�� �� : " + matcher.group());
			System.out.println("��ġ : " + matcher.start() + " ���� " +
			 matcher.end() + " ����");
		}
	}
}
















































