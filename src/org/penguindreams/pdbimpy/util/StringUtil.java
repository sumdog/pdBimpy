package org.penguindreams.pdbimpy.util;

public class StringUtil {

	
	/** Trim characters in prefix and suffix.
	 * 
	 * For example,<br />
     * <b>aaaaWelcomeaaaa<b/><br />
	 * in this 'a' needs to be removed/trim and output String has to be like below<br />
     * <b>Welcome</b>
	 * 
	 * Taken and modified from: 
	 * http://www.javafundu.com/2009/02/trim-prefix-and-suffix-any-characters.html
	 *  
 	 * @param str String 
	 * @param ch character which has to be removed
	 * @return null, if str is null, otherwise string will be returned 
	 * without character prefixed/suffixed
	 */
	public static String trim(String str, char ch) {
		if (str == null)
			{ return null; }
		int count = str.length();
		int len = str.length();
		int st = 0;
		char[] val = str.toCharArray();

		while ((st < len) && (val[st] <= ch)) {
			st++;
		}
		while ((st < len) && (val[len - 1] <= ch)) {
			len--;
		}
		return ((st > 0) || (len < count)) ? str.substring(st, len) : str;
	}
	
}
