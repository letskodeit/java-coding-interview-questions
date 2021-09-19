package interviewquestions;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		System.out.println("First Non Repeating Character is: " + firstNonRepeating("abacabad"));
		// Nested for loop, Nsquare
	}
	
	public static char firstNonRepeating(String s) {
//		for (int i=0; i<s.length(); i++) {
//			if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
//				return s.charAt(i);
//			}
//		}
		
		// HashMap -> Key/Value Pair
		Map<Character, Integer> countMap = new HashMap<Character, Integer>();
		for (int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			Integer charCount = countMap.get(c);
			countMap.put(c, charCount == null ? 1 : charCount + 1);
//			if (countMap.containsKey(c)) {
//				countMap.put(c, countMap.get(c) + 1);
//			} else {
//				countMap.put(c, 1);
//			}
		}
		
		for (int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if (countMap.get(c) == 1) {
				return c;
			}
		}
		
		// 2N -> N
		return '_';
	}
}