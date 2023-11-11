package practice.d4;

public class $12BinaryToDecimal {
	
public static void binToDec(int binNum) {
	
	int myNum= binNum;
	
     int pow=0;
	int decNum=0;
	
	while(binNum>0) {
		
		int lastDigit=binNum%10;
		
		decNum=decNum+lastDigit*(int)Math.pow(2, pow);
		pow++;
		binNum=binNum/10;
	}
	System.out.println("Decimal No :  "+myNum+"   =  "+decNum);
}
public static void main(String[] args) {
	binToDec(100);
	binToDec(1001101);
	binToDec(1111111111);
}
}
