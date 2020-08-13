package codingninjas;

public class StringRecursion {
	public static String removeocc(String s,char x,char y) {
		if(s.length()==0) {
			return s;
		}
		String smalloutput=removeocc(s.substring(1),x,y);
		if(s.charAt(0)==x) {
			return y+smalloutput;
		}else {
			return s.charAt(0)+smalloutput;
		}
	}

	public static void main(String[] args) {
	String s="abxxxy";
	char a='x',b='y';
	
	System.out.println(StringRecursion.removeocc(s,a,b));

	}

}
