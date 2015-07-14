package simplePrograms;

public class AddPercentage20 {
	
	public String addPercentage(String s){
		String newString = "";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' ')
				newString = newString +"%20";
			else{
			newString = newString + s.charAt(i);
			}
		}
		System.out.println(newString);
			return newString;
	}
	
	public static void main(String args[]){
		AddPercentage20 obj = new AddPercentage20();
		obj.addPercentage("hello wor ld");
	}

}
