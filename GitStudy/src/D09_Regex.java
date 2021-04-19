

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D09_Regex {
	/*
	 	# Á¤±ÔÇ¥Çö½Ä (Regular Expression)
	 	  - ¹®ÀÚ¿­ÀÇ ÆĞÅÏÀ» Ç¥ÇöÇÏ´Â Ç¥Çö½Ä
	 	  - Æ¯Á¤ ÇÁ·Î±×·¡¹Ö ¾ğ¾î¿¡ Á¾¼ÓµÇÁö ¾Ê´Â´Ù
	 	  - ÇÁ·Î±×·¡¸Ó°¡ ¿øÇÏ´Â ¹®ÀÚ¿­ ÆĞÅÏ°ú ÀÏÄ¡ÇÏ´ÂÁö °Ë»ç¶ş‹š »ç¿ëÇÑ´Ù
	 	  
	 	# Pattern Å¬·¡½º
	 	  - Á¤±ÔÇ¥Çö½ÄÀ» ´Ù·ç´Â Å¬·¡½º
	 	  
	 	# Matcher Å¬·¡½º
	 	  - ÆĞÅÏ ÀÎ½ºÅÏ½º¸¦ ÀÌ¿ëÇÏ¿© ¹®ÀÚ¿­À» °Ë»çÇÒ ¶§ »ç¿ëÇÏ´Â Å¬·¡½º
	 */
	
	public static void main(String[] args) {
		// Pattern.matches(regex, input) : inputÀÌ regex¿¡ ¸ÅÄ¡µÇ´Â 
		// ¹®ÀÚ¿­ÀÎÁö¸¦ °Ë»çÇØÁÖ´Â ¸Ş¼­µå
		System.out.println(Pattern.matches("sleep", "sleep"));
		
		// [] : ÇØ´ç À§Ä¡ÀÇ ÇÑ ±ÛÀÚ¿¡ ¾î¶² ¹®ÀÚµéÀÌ ¿Ã ¼ö ÀÖ´ÂÁö Á¤ÀÇÇÏ´Â Ç¥Çö½Ä
		System.out.println(Pattern.matches("s[lh@]eep", "sleep"));
		System.out.println(Pattern.matches("s[lh@]eep", "sheep"));
		System.out.println(Pattern.matches("s[lh@]eep", "s@eep"));
		
		/*
		  [] ³»ºÎ¿¡ Á¤ÀÇÇÒ ¼ö ÀÖ´Â °Íµé
		    
		    1. abc  : ÇØ´ç ÀÚ¸®¿¡ a or b or c Çã¿ë
		    2. ^abc : ÇØ´ç ÀÚ¸®¿¡ abc¸¦ Á¦¿ÜÇÑ ¸ğµç°ÍÀ» Çã¿ë
		    3. a-z  : a ºÎÅÍ z±îÁö ¸ğµÎ Çã¿ë
		    4. &&   : ±³ÁıÇÕ
		  
		 */
		
		System.out.println(Pattern.matches("s[^lh@]eep", "s!eep"));
		System.out.println(Pattern.matches("s[0-9]eep", "s0eep"));
		System.out.println(Pattern.matches("s[0-9a-z]eep", "s0eep"));
		System.out.println(Pattern.matches("s[a-d&&c-f]eep", "sceep"));
		System.out.println(Pattern.matches("s[a-d&&c-f]eep", "sfeep"));
		
		Pattern instance = Pattern.compile("[0-9]@[0-9]");
		
		/*
		 ¿©·¯ ¹®ÀÚ¸¦ ³ªÅ¸³»´Â °Íµé
		 	
		 	1.  . : ¸ğµç ¹®ÀÚ ¡Ø [] ¹Û¿¡ ½á¾ß ¸ğµç ¹®ÀÚ
		 	2. \d : ¸ğµç ¼ıÀÚ
		 	3. \D : ¼ıÀÚ¸¦ Á¦¿ÜÇÑ ¸ğµç °Í
		 	4. \s : ¸ğµç °ø¹é (\t, \n .. µîÀÇ ¸ğµç °ø¹éµé)
		 	5. \S : °ø¹éÀ» Á¦¿ÜÇÑ ¸ğµç °Í
		 	6. \w : ÀÏ¹İÀûÀÎ ¹®ÀÚµéÀ» Çã¿ë [a-zA-Z0-9_]
		 	7. \W : ÀÏ¹İÀûÀÎ ¹®ÀÚµéÀ» Á¦¿ÜÇÑ ¸ğµç°ÍÀ» Çã¿ë
		 */
		System.out.println(Pattern.matches("s.eep", "s!eep")); // ¸ğµç¹®ÀÚ
		System.out.println(Pattern.matches("s[.]eep", "s!eep")); // .¸¸ Çã¿ë
		System.out.println(Pattern.matches("s\\.eep", "s!eep")); // .¸¸ Çã¿ë
		
		System.out.println(Pattern.matches("s\\deep", "s9eep"));
		System.out.println(Pattern.matches("\\D\\D\\D", "cat"));
		
		System.out.println(Pattern.matches("s\\seep", "s eep"));
		System.out.println(Pattern.matches("s\\seep", "s\neep"));
		System.out.println(Pattern.matches("s\\seep", "s\teep"));
		System.out.println(Pattern.matches("s\\seep", "s\reep"));
		System.out.println(Pattern.matches("s\\seep", "sleep"));
		
		System.out.println(Pattern.matches("s\\Sep", "s eep"));
		
		/*
		 	ÇØ´ç ÆĞÅÏÀÌ Àû¿ëµÉ ¹®ÀÚÀÇ °³¼ö¸¦ Á¤ÀÇÇÏ´Â ¹æ¹ı
		 	
		 	  1. [ex]{n} : {}¾ÕÀÇ ÆĞÅÏÀÌ n°³ ÀÏÄ¡ÇØ¾ß ÇÑ´Ù
		 	  2. [ex]{n, m} : {} ¾ÕÀÇ ÆĞÅÏÀÌ ÃÖ¼Ò n°³ ÀÌ»ó ÃÖ´ë m°³(mÆ÷ÇÔ) ±îÁö ÀÏÄ¡ÇØ¾ß ÇÑ´Ù
		 	    * Á¤±ÔÇ¥Çö½Ä¿¡ {n, m}Ã³·³ °ø¹éÀ» ³ÖÀ¸¸é ¾ÈµÈ´Ù
		 	  3. [ex]{n,} : {} ¾ÕÀÇ ÆĞÅÏÀÌ ÃÖ¼Ò n°³ ÀÌ»ó ÀÏÄ¡ÇØ¾ßÇÑ´Ù
		 	  4. [ex]? : 0¹ø ¶Ç´Â ÇÑ¹ø
		 	  5. [ex]+ : ÃÖ¼Ò ÇÑ¹ø ÀÌ»ó
		 	  6. [ex]* : 0¹ø ¶Ç´Â ¿©·¯¹ø
		 */
		int _ = 1;
		System.out.println("Àß¸¸µÊ;; : " +_);
		System.out.println(Pattern.matches("[\\D3-5]{5}\\.txt", "34534.txt"));
		System.out.println(Pattern.matches("[\\D3-5]{2,5}\\.txt", "34534.txt"));
		System.out.println(Pattern.matches("[°¡-ÆR]{2,}\\.txt", "¾È³ç.txt"));
		System.out.println(Pattern.matches("[°¡-ÆR]{2,}\\.txt", "¾È³çÇÏ¼¼¿¬.txt"));
		System.out.println(Pattern.matches("[°¡-ÆR]{2,}\\.txt", "Hello.txt"));
		
		System.out.println(Pattern.matches(".{2,}\\.txt", "Hello.txt"));
		
		String regex1 = String.format(".{%d}\\.txt", 2);
		System.out.println(Pattern.matches(regex1, "abcd.txt"));

		System.out.println(Pattern.matches("[°¡-ÆR]?\\.txt", ".txt"));
		System.out.println(Pattern.matches("[°¡-ÆR]?\\.txt", "ÇÑ.txt"));
		System.out.println(Pattern.matches("[°¡-ÆR]?\\.txt", "ÇÑ±Û.txt"));

		// ÀüÈ­¹øÈ£ Á¤±ÔÇ¥Çö½Ä
		System.out.println(Pattern.matches("0\\d{3}-?\\d{3,4}-?\\d{4}", "01012341234"));
		System.out.println(Pattern.matches("0\\d{3}-?\\d{3,4}-?\\d{4}", "0101234123"));
		System.out.println(Pattern.matches("0\\d{3}-?\\d{3,4}-?\\d{4}", "010-1234-1234"));
		System.out.println(Pattern.matches("0\\d{3}-?\\d{3,4}-?\\d{4}", "010-123-4234"));
		
		// ÀÚ¹Ù¿¡¼­ Çã¿ëÇÏ´Â º¯¼ö¸íÀ» °Ë»çÇÒ ¼ö ÀÖ´Â Á¤±ÔÇ¥Çö½Ä ¸¸µé±â
		System.out.println(Pattern.matches("[$\\w&&\\D&&\\S][\\S&&\\w$]{1,}", ""));
		
		/* 
		 	# Pattern.compile
			  - Àü´ŞÇÑ Á¤±ÔÇ¥Çö½ÄÀ» ÇØ¼®ÇÏ¿© Pattaern ÀÎ½ºÅÏ½º¸¦ »ı¼ºÇÏ°í ¹İÈ¯ÇÑ´Ù
			  - Pattern Å¸ÀÔ ÀÎ½ºÅÏ½º¸¦ ¿ä±¸ÇÏ´Â °÷¾Ö »ç¿ëÇÒ ¼ö ÀÖ´Ù
			
			# split() : ÄÄÆÄÀÏµÈ ÆĞÅÏ ÀÎ½ºÅÏ½º·Î ¹®ÀÚ¿­ split()À» ÁøÇà
			
			# matcher() : Matcher ÀÎ½ºÅÏ½º¸¦ »ı¼ºÇÏ¿© ¹İÈ¯ÇÑ´Ù
		 */
		
		String fruit_text = "apple/banana/orange/grape/peach/mango/pineapple";
		
		Pattern regex = Pattern.compile("/");
		
		String[] fruits = regex.split(fruit_text);
		
		System.out.println(Arrays.toString(fruits));
		
		Pattern regex2 = Pattern.compile("[a-zA-Z]+");
		
		Matcher matcher = regex2.matcher(fruit_text);
		
		while(matcher.find()) {
			System.out.println("Ã£Àº °Í : " + matcher.group());
			System.out.println("À§Ä¡ : " + matcher.start() + " ºÎÅÍ " +
			 matcher.end() + " ±îÁö");
		}
	}
}

















































