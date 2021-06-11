package com.workshop;
class Calculator3{
	// µ¡¼À, »¬¼À ,°ö¼À , ³ª´°¼À 
	static int add(int x, int y) {
		
		return x+y;
	}
	static int subtract(int x, int y) {
			 
			return x-y; 	
	}
	static double multipl(double d, double e) {
			
			return (double)d * e;
		}
	static double divide(double d, double e) {
		
		return (double)d / e;
	}
}
public class Sample15 {

	public static void main(String[] args) {
	Calculator3 calc =new Calculator3();		
	int a = calc.add(10,20) ;
		System.out.println(a);
	int b = calc.subtract(20, 10);
		System.out.println(b);
	double c = calc.multipl(3.5, 2.0);
		System.out.println(c);
	double d = calc.divide(2.2, 3.4);
		System.out.println(d);
		
	}

}
