
public class $1DADA {
public static void main(String[] args) {
	dada s1 = new dada();
	s1.allSon("Ram");
	s1.allSon("Shyam");
	System.out.println("Son: "+s1.son);
	
	s1.allDtr("Urvarshi");
	System.out.println("Daughter: "+s1.daughter);
	
	s1.allRelative("Ram Prasad");
	System.out.println("Relative: "+ s1.Relative);
	
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