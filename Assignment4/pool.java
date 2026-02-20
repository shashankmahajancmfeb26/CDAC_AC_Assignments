// String Pool with intern() Method  

class Pool{
	public static void main(String[] args){
		String str1 = new String("hello"); 
		String str2 = str1.intern(); 
		String str3 = "hello";
		
		System.out.print("Is str2 and str3 pointing to the same object?: ");
		System.out.println(str2==str3);	
	}
}