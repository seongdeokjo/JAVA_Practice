package cal;

public class Calculator {

	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public int substract(int num1, int num2) {
		return num1 - num2;
	}
	
	public int multiply(int num1,int num2){
		return num1 * num2;
	}
	
	public int divide(int num1, int num2) {
		return num1 / num2 ;
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		// test
		System.out.println(cal.add(10, 20));
				
	}
	
	
}
