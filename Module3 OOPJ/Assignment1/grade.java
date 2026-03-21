/* Take marks of 5 subjects and: 
● Calculate total 
● Calculate percentage 
● Print grade (A/B/C/Fail)
*/
class grade{
	public static void main(String args[])
	{
		int math = 75;
		int sci = 89;
		int eng = 69;
		int mar = 86;
		int hin = 74;
		int total, per;
		total = math+sci+eng+mar+hin;
		System.out.println("Total Marks: "+total);

		per = total/5;
		System.out.println("Percentage: "+per);

		if(per>=75)
			System.out.println("Grade A");
		else if(per>=60 && per<75)
			System.out.println("Grade B");
		else if(per>=40 && per<60)
			System.out.println("Grade C");
		else
			System.out.println("Fail");		
	}		
}
/*
Output:
Total Marks: 393
Percentage: 78
Grade A
*/