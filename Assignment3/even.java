// Print Even Numbers (Using while Loop)
import java.util.Scanner;

class number{
	int i;

	void printEvenNumbers(){
		while(i<=50){
			if(i%2==0){
				System.out.print(i+" ");
			}
		i++;
		}
	}
}
class even{
	public static void main(String[] args){
		number n = new number();
		n.printEvenNumbers();
	}

}