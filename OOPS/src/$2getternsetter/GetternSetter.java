package $2getternsetter;


public class GetternSetter {
public static void main(String[] args) {
	dada s1 = new dada();
	s1.setSon("Ram");
	s1.setSon("Shyam");
	System.out.println("Son: "+s1.getSon());
	
	s1.setDtr("Urvarshi");
	System.out.println("Daughter: "+s1.getDtr());
	
	s1.setRelative("Ram Prasad");
	System.out.println("Relative: "+ s1.getRelative());
	
	fruit f1 = new fruit();
	f1.setFruit1("Mango");
	f1.setFruit2("Banana");
	f1.setFruit3("Pineapple");
	System.out.println("All fav. fruits of DADA: "+ f1.fruit1+" , "+ f1.fruit2+ " , "+f1.fruit3);
}
}

class dada{
	private String son;
	private String daughter;
	private String relative;
		 String getSon() {
			 return this.son;
		 }
		 String getDtr() {
			 return this.daughter;
		 }
		 String getRelative() {
			 return this.relative;
		 }
					void setSon(String newSon) {
						this.son=newSon;
					}
					void setDtr( String newDtr) {
						this.daughter= newDtr;
					}
					void setRelative(String newRel) {
						this.relative= newRel;
					}
}

class fruit{
	String fruit1, fruit2, fruit3;
	
		String getFruit1() {
			return this.fruit1;
		}
		String getFruit2() {
			return this.fruit2;
		}
		String  getFruit3() {
			return this.fruit3;
		}
					void setFruit1(String newFrt1) {
						this.fruit1 = newFrt1;
					}
					void setFruit2( String newFrt2) {
						this.fruit2=newFrt2;
					}
					void setFruit3( String newFrt3) {
						this.fruit3 = newFrt3;
					}
}