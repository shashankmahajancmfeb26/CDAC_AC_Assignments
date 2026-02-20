import java.util.Scanner;

class Rectangle {
	    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Lenght of Rectangle");
		int len = sc.nextInt();
		System.out.println("Enter the Width of Rectangle");
		int wid = sc.nextInt();
		int Area;
		Area = len * wid;
		System.out.println("Area of Rectangle is "+ Area);
}
}