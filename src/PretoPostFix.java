package simplePrograms;

import java.util.Stack;

public class PretoPostFix {
	
	public String convertToPostFix(String s){
		String postFix = "";
		Stack<Character> operatorStack = new Stack<Character>();
		if(s==null)
			return null;
		else{
			for(int i=0;i<s.length();i++){
				char c = s.charAt(i);
				if((Character.isDigit(c))){
					postFix = postFix + c;
				}
				else{
					if(operatorStack.isEmpty()){
						operatorStack.push(c);
					}
					else if(c=='+' || c == '-'){
						if(operatorStack.peek()=='*' ||operatorStack.peek()=='/' || operatorStack.peek()=='^' ){
							postFix = postFix + operatorStack.pop();
							operatorStack.push(c);
						}
						else
							operatorStack.push(c);
					}
					else if(c=='*' || c == '/'){
						if(operatorStack.peek()=='^' ){
							postFix = postFix + operatorStack.pop();
							operatorStack.push(c);
						}
						else
							operatorStack.push(c);
					}
					else if(c=='^'){
							operatorStack.push(c);
					}
					}
				}
			while(!operatorStack.isEmpty())
				postFix = postFix + operatorStack.pop();
			return postFix;
			}
	}
	
	public static void main(String args[]){
		PretoPostFix preToPostFix = new PretoPostFix();
		String s = "3 * 5 + 4 ^ 5 ^ 6";
		String postFix = preToPostFix.convertToPostFix(s);
		//System.out.println(postFix);
		PostFixStackParser postFixStackParser = new PostFixStackParser();
		System.out.println(postFixStackParser.calculateExpressionPostFix(postFix));
		
	}

}
