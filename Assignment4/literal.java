//   String Literal and Object Creation

class literal{
	public static void main(String[] args){
		String str1 = "hello";
		String str2 = "hello";
		
		System.out.print("Both variables point to the same object: ");
		System.out.println(str1==str2);
	}
}