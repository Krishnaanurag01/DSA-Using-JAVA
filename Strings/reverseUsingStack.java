package Strings;
import java.util.*;

public class reverseUsingStack {
	public static void main(String[] args) {
		Stack<Character> stack=new Stack();
		String word = "madamt";
		char[] wordArray= word.toCharArray();
		for (char c : wordArray) {
			stack.push(c);
		}
		for (int i = 0; i < wordArray.length; i++) {
			wordArray[i]=stack.pop();
		}
		System.out.println(new String(wordArray));
	}

}

