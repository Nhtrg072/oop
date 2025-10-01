import java.util.HashSet;
import java.util.Set;

public class StringCode {

	/**
	 * Trả về độ dài chuỗi con dài nhất gồm các ký tự giống nhau liên tiếp.
	 */
	public static int maxRun(String str) {
		if (str.isEmpty()) return 0;
		int maxRunLength = 1;
		int currentRunLength = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i - 1))
			{
				currentRunLength++;
				if (currentRunLength > maxRunLength) {
					maxRunLength = currentRunLength;
				}
			} else
			{
				currentRunLength = 1;
			}
		}
			return maxRunLength;
	}

	
	/**
	 * Thay mỗi chữ số bằng chừng đó lần ký tự đứng sau. Chữ số cuối bị xóa.
	 */
	public static String blowup(String str)
	{
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < str.length(); i++)
		{
			char currentChar = str.charAt(i);
			if (Character.isDigit(currentChar))
			{
				int count = Character.getNumericValue(currentChar);
				if (i + 1 < str.length())
				{
					char nextChar = str.charAt(i + 1);
					for (int j = 0; j < count; j++)
					{
						result.append(nextChar);
					}
				}
			}
			else
			{
				result.append(currentChar);
			}
		}
		return result.toString();
	}
	
	/**
	 * Kiểm tra hai chuỗi có xâu con chung độ dài len hay không.
	 */
	public static boolean stringIntersect(String a, String b, int len) {
		{
			Set<String> substrings = new HashSet<>();
			for (int i = 0; i <= a.length() - len; i++) {
				substrings.add(a.substring(i, i + len));
			}
			for (int i = 0; i <= b.length() - len; i++) {
				if (substrings.contains(b.substring(i, i + len))) {
					return true;
				}
			}
			return false;
		}
	}
}
