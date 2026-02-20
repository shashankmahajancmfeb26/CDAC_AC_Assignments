import java.util.Scanner;

class Square {
	    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Side of Square");
		int side = sc.nextInt();
		int Area;
		Area = side * side;
		System.out.println("Area of Square is "+ Area);
}
}