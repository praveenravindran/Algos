package simplePrograms;

import java.util.Stack;

public class StackParanthesis {
	public boolean checkForBalancedParanthesis(String s){
		Stack<Character> stackk = new Stack<Character> ();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='(' || s.charAt(i)== '{' || s.charAt(i) == '['){
				stackk.push(s.charAt(i));
			}
			if(s.charAt(i)==')'){
				if(stackk.isEmpty() || stackk.peek()!='(')
					return false;
				else
					stackk.pop();
			}
			if(s.charAt(i)=='}'){
				if(stackk.isEmpty() || stackk.peek()!='{')
					return false;
				else
					stackk.pop();
			}
			if(s.charAt(i)==']'){
				if(stackk.isEmpty() || stackk.peek()!='[')
					return false;
				else
					stackk.pop();
			}
		}
		return stackk.isEmpty();
	}
	
	public static void main(String args[]){
		String s = "({hi})";
		StackParanthesis stackParanthesis = new StackParanthesis();
		System.out.println(stackParanthesis.checkForBalancedParanthesis(s));
	}

}
