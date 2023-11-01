package practice.d4;

public class $8BinaryToDecimal {
	
	public static int binaryToDeci(String binary) {
		
		int deci = 0;
		
		int base = 1;
		
		for( int x=binary.length()-1; x>=0; x--) {
			
			if(binary.charAt(x)=='1') {
				
				deci += base;
			}
			base *= 2;
		}
		return deci;
	}
	public static void main(String[] args) {
		
		String input = "1101";
		int bn = binaryToDeci(input);
		System.out.println("Binary: "+ input);
		System.out.println("Decimal: "+bn);
	}

}
