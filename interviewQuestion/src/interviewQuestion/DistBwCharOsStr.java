package interviewQuestion;

public class DistBwCharOsStr {
public static void main(String[] args) {
	String name = "abhishek aryan";
	int fn = name.indexOf('a');
	int ln = name.lastIndexOf('a');

	if(fn != -1 && ln != -1) {
		int dist = ln-fn;
		System.out.println("output: "+ dist);
	}
	else {
		System.out.println(" na");
	}
	
}
}
