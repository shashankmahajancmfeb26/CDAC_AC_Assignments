// String Concatenation and Object Creation 

class concatenation{
	public static void main(String[] args){
		String str1 = "hello";
		String str2 = "world";
		String str3 = str1 + str2;
		
		System.out.print("Is "+str3+" pointing to the same object as "+str1+"?: ");
		System.out.println(str1==str3);	
	}
}