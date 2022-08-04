package strings.problems;

public class ProbNo168_ExcelSheetColumnTitle {
	public static String convertToTitle(int columnNumber) {
		/*
		 * if columnNumber == 0 then return empty string ""
		 * else - recursion on covertToTile method until convertToTitle returns empty string, decrement columnNumber by 1 for each recursive call
		 * for each recursive call, take the 'remainder = columnNumber%26' and converts it into character and add to char 'A' and concatenate at end
		 * 		
		 * converToTile(--columnNumber/26)     + (char)('A' + columnNumber % 26)
		 * 				/										\
		 * 			   /										 \
		 * 			  /											  \
		 *       (recursive call)							(converts the remainder into character and adds at end of return statement)
		 *       
		 *       Single line code: return convertToTitle(columnNumber--/26) + (char)('A' + columnNumber%26);
		 */

		// 0 ms speed code below
		if(columnNumber == 0) return "";
		StringBuilder sb = new StringBuilder();
		while(columnNumber > 0) {
			columnNumber--;
			char columnName = (char)('A' + columnNumber%26);
			sb.append(columnName);
			columnNumber = columnNumber / 26;
		}
		return sb.reverse().toString();
		
		
        
    }
	
	public static void main(String[] args) {
		String res = convertToTitle(1);
		System.out.println(res);
	}
}
