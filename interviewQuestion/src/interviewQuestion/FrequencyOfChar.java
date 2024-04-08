package interviewQuestion;

public class FrequencyOfChar {
	public static void main(String[] args) {
	
		String str = "abhishek aryan amita";
		char ch = 'a';
		int frq = 0;
		for( int i=0;i<str.length();i++) {
			if( ch == str.charAt(i)) {
				 //frq = frq+1;
				++frq;
			}
		}
System.out.println("Frequency of a Char  :     "+ frq);
	}	
}
