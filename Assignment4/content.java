// Multiple String Literals with Same Content

class content{
	public static void main(String[] args){
		String str1 = "Java";
		String str2 = "Java";
		String str3 = "Java";
		
		boolean b = (str1==str2) && (str2==str3);
		System.out.print("All strings point to the same object?: "+b);
	}
}