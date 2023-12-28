package interviewQuestion;

public class PrePostIncrement {
	public String increment() {
		int  a=3;
		int b=6;
		int t = (a+b);
		t++;
		return "sum: " + t;
		
	}
public static void main(String[] args) {	
	int sum=0;
	for(int i=0;i<=3;i++) {
		sum=sum+i;
		//sum++;
		//++sum;
	}
	//sum++;
	System.out.println(sum);
	PrePostIncrement prePostIncrement = new PrePostIncrement();
	System.out.println(prePostIncrement.increment());
}
}
