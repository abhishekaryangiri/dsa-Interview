package practice.d4;

public class $6PerfectSqr {
	
	public static boolean checkPerfectSqr(int num) {
		
		if(num<0) {
			return false;
		}
		 int sqr =(int) Math.sqrt(num);
		 
		return  sqr*sqr == num;
	}
	public static void main(String[] args) {
		int num = 100;	 
		boolean check = checkPerfectSqr(num);
		System.out.println(check);
	}

}
