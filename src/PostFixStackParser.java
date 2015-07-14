package simplePrograms;

import java.util.Stack;
import java.math.*;

public class PostFixStackParser {
	public Stack<Integer> stack = new Stack<Integer>();
	public int calculateExpressionPostFix(String s){
		int secondOperand= 0;
		int firstOperand=0;
		int result=0;
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='-'){
				if(!stack.isEmpty()){
					secondOperand = stack.pop();	
				}
				else
					secondOperand = 0;
				if(!stack.isEmpty()){
					firstOperand = stack.pop();	
				}
				else
					firstOperand = 0;
					//result = firstOperand - secondOperand;
					stack.push(new Integer(firstOperand - secondOperand));
				//	System.out.println(result);
				//	System.out.println(stack.get(1));
				//	System.out.println(stack.get(0));
					
					//.out.println(stack.peek());
				}
			if(s.charAt(i)=='+'){
				if(!stack.isEmpty()){
					secondOperand = stack.pop();	
				}
				else
					secondOperand = 0;
				if(!stack.isEmpty()){
					firstOperand = stack.pop();	
				}
				else
					firstOperand = 0;
					//result = firstOperand - secondOperand;
					stack.push(new Integer(firstOperand + secondOperand));
				//	System.out.println(result);
				//	System.out.println(stack.get(1));
				//	System.out.println(stack.get(0));
					
					//.out.println(stack.peek());
				}
			if(s.charAt(i)=='*'){
				if(!stack.isEmpty()){
					secondOperand = stack.pop();	
				}
				else
					secondOperand = 0;
				if(!stack.isEmpty()){
					firstOperand = stack.pop();	
				}
				else
					firstOperand = 0;
					//result = firstOperand - secondOperand;
					stack.push(new Integer(firstOperand * secondOperand));
				//	System.out.println(result);
				//	System.out.println(stack.get(1));
				//	System.out.println(stack.get(0));
					
					//.out.println(stack.peek());
				}
			if(s.charAt(i)=='/'){
				if(!stack.isEmpty()){
					secondOperand = stack.pop();	
				}
				else
					secondOperand = 0;
				if(!stack.isEmpty()){
					firstOperand = stack.pop();	
				}
				else
					firstOperand = 0;
					//result = firstOperand - secondOperand;
					stack.push(new Integer(firstOperand / secondOperand));
				//	System.out.println(result);
				//	System.out.println(stack.get(1));
				//	System.out.println(stack.get(0));
					
					//.out.println(stack.peek());
				}
			if(s.charAt(i)=='^'){
				if(!stack.isEmpty()){
					secondOperand = stack.pop();	
				}
				else
					secondOperand = 0;
				if(!stack.isEmpty()){
					firstOperand = stack.pop();	
				}
				else
					firstOperand = 0;
					//result = firstOperand - secondOperand;
					stack.push(new Integer((int) Math.pow(firstOperand, secondOperand)));
				//	System.out.println(result);
				//	System.out.println(stack.get(1));
				//	System.out.println(stack.get(0));
					
					//.out.println(stack.peek());
				}
			
			if(Character.isDigit(s.charAt(i)) )
			{	stack.push((int)Character.digit(s.charAt(i), 36));
				//System.out.println(stack.peek());
				}
			
		}
		return stack.pop();
	}
	
	public void print(){
		for(int i = 0 ; i < stack.size();i++){
			System.out.println(stack.get(i));
		}
	}
	
	public static void main(String args[]){
		//Stack st = new Stack();
		//st.push("");
		//System.out.println(st.peek());
		PostFixStackParser postFixStackParser = new PostFixStackParser();
		String s="2 7 5 - * 8 5 - *";
		//System.out.println(Character.digit(s.charAt(0), 36));
		int blah = postFixStackParser.calculateExpressionPostFix(s);
		System.out.println(blah);
		//postFixStackParser.print();
	}

}
