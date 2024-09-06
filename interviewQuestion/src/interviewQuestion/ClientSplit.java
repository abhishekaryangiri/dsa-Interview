package interviewQuestion;

public class ClientSplit {
public static void main(String[] args) {
	
	SplitMethod splitMethod = new SplitMethod();
	 String ab = splitMethod.splitCall();
	 //System.out.println(ab);
	String[] remo = ab.split(",");
	for(String p: remo) {
		System.out.println(p);
	}

}
}
