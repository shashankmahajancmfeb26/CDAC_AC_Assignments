// Identify the Values of Uninitialized Variables

class variables{
	byte a;
	short b;
	int c;
	long d;
	float e;
	double f;
	char g;
	boolean h;
}
class values{
	public static void main(String[] Args){
		variables v = new variables();
		System.out.println(v.a);
		System.out.println(v.b);
		System.out.println(v.c);
		System.out.println(v.d);
		System.out.println(v.e);		
		System.out.println(v.f);
		System.out.println(v.h);
	}

}