
public class Palindrome {

	public long initialValue(long digits) {
		return (long) Math.pow(10, digits -1);
	}
	
	public boolean isPalindrome(long number) {
		String s = String.valueOf(number);
		char[] c = s.toCharArray();
		
		String v = "";
		for(int i = c.length - 1; i >= 0; i--) {
			v = v.concat(String.valueOf(c[i]));
		}
		
		return Math.subtractExact(Long.valueOf(v), Long.valueOf(s)) == 0;
	}
}
