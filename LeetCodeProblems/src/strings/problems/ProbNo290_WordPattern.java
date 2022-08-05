package strings.problems;

import java.util.HashMap;

import java.util.Map;
import java.util.Map.Entry;

public class ProbNo290_WordPattern {
	public static boolean wordPattern(String pattern, String s) {
		String[] splittedArray = s.split(" ");
       if(pattern.length() != splittedArray.length) return false;
       
       Map<Character, String> map = new HashMap<>();
       for(int i=0; i<pattern.length(); i++) {
    	   if(map.get(pattern.charAt(i)) == null) {
    		   if(map.values().toArray().length >0) {
    			   if(map.containsValue(splittedArray[i])) return false;
    			   
    		   }
    		   map.put(pattern.charAt(i), splittedArray[i]);
    		   
    	   }
    	   else {
    		   if(!map.get(pattern.charAt(i)).equals(splittedArray[i])) {
    			   
    			   return false;
    		   }
    	   }
       }
       // looping over key, values in map
//       for(Entry<Character, String> m : map.entrySet())
//      		System.out.println(m.getKey() + " : " + m.getValue());
       		
		return true;
    }
	public static void main(String[] args) {
		boolean res = wordPattern("abc", "b c a");
		System.out.println( res);
	}
}
