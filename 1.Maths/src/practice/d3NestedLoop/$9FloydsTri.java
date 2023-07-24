package practice.d3NestedLoop;

public class $9FloydsTri {
public static void main(String[] args) {
	int x=6;
	int num=1;
	//out lp
	for(int a=1;a<=x;a++) {
		//inr lp
		for(int b=1;b<=a;b++) {
			System.out.print(num  + " ");
			num++;
		}
		System.out.println();
	}
}
}
