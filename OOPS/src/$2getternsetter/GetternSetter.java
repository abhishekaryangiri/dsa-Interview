package $2getternsetter;

public class GetternSetter {

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
}