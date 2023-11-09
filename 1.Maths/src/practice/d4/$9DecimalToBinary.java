package practice.d4;

public class $9DecimalToBinary {
	
	public static String deciToBinary(int deci) {
		
		if(deci == 0) {
			return "0"; //for spl case like 0
		}
		StringBuilder binary = new StringBuilder();
		
		while(deci > 0) {
			int reminder = deci % 2;
			binary.insert(0, reminder);
			deci /= 2;
		}
		return binary.toString();
	}
	public static void main(String[] args) {
		int dn = 25;
		String bn = deciToBinary(dn);
		System.out.println("Decimal: "+dn);
		System.out.println("Binary: "+bn);
	}

}
