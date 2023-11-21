
public class Strings_ {

	public static void main(String[] args) {
		String s="katodozi";
		String str=new String("katodozi");
		System.out.println("The String:");
		System.out.println(str);
		int l=str.length();
		System.out.println("The length of the string:"+l);
		System.out.println("The Upper class string:\n"+s.toUpperCase());
		//comparing the strings s and str.........
		System.out.println("Reference wise comparing........");
		if(s==str) {//since they are stored in the different variables the are not equal referentally
			System.out.println("Strings s and str are equal...!!!");	
		}else {
			System.out.println("Strings s and str are not equal....!!");
		}
		System.out.println("Content wise comparing.......");
		//comparing only the content.....
		if(str.equals(s)) {
			System.out.println("Equal!!");
		}else {
			System.out.println("Not equal!!");
		}
	}

}
