package codingninjas;

public class Stringremove {
	public static String removeocc(String s,char x,char y) {
		if(s.length()==0) {
			return s;
		}
		String smalloutput=removeocc(s.substring(1),x,y);
		if(s.charAt(0)==x) {
			return smalloutput;
		}else {
			return s.charAt(0)+smalloutput;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abxxxy";
		char a='x',b='y';
		
		System.out.println(StringRecursion.removeocc(s,a,b));


	}

}
