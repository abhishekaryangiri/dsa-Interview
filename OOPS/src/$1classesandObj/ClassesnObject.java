package $1classesandObj;

public class ClassesnObject {
public static void main(String[] args) 
	dada s1 = new dada();
	s1.allSon("Ram");
	s1.allSon("Shyam");
	System.out.println("Son: "+s1.son);
	
	s1.allDtr("Urvarshi");
	System.out.println("Daughter: "+s1.daughter);
	
	s1.allRelative("Ram Prasad");
	System.out.println("Relative: "+ s1.Relative);
	
	
	fruit f1 = new fruit();
	f1.setFruit1("Mango");
	f1.setFruit2("Banana");
	f1.setFruit3("Pineapple");
	System.out.println("All fav. fruits of DADA: "+ f1.fruit1+" , "+ f1.fruit2+ " , "+f1.fruit3);
}
}
class dada{
	String son;
	String daughter;
	String Relative;
	
		void allSon(String newSon) {
			son=newSon;
		}
		void allDtr( String newDtr) {
			daughter= newDtr;
		}
		void allRelative(String newRel) {
			Relative= newRel;
		}
}

class fruit{
	String fruit1, fruit2, fruit3;
	
		void setFruit1(String newFrt1) {
			fruit1 = newFrt1;
		}
		void setFruit2( String newFrt2) {
			fruit2=newFrt2;
		}
		void setFruit3( String newFrt3) {
			fruit3 = newFrt3;
		}
}