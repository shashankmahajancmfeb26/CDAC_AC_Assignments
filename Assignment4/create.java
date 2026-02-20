// String Creation with new Keyword

class create{
	public static void main(String[] args){
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.print("Using ==: ");
		System.out.println(str1==str2);
		System.out.print("Using .equals(): ");
		System.out.println(str1.equals(str2));	
	}
}