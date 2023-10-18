package practice.d4;

public class $13DecToBin {
		public static void decToBin(int decNum) {
			int pow=0;
			int binNum=0;
			while(decNum>0) {
				int rem=decNum%2;
				binNum=binNum+(rem*(int)Math.pow(2, pow));
				pow++;
				decNum=decNum/2;
			}
			System.out.println(binNum);
		}
		public static void main(String[] args) {
		
			decToBin(9);
		}
}
