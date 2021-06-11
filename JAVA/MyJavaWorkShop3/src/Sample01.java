
//Reference type 에서는 값이 저장이 안되어 있어도 자동으로 초기화 된다.
class MyTest{
	public int c;
	public String d;
}
public class Sample01 {

	public static void main(String[] args) {
//		int a = 10;
//		//int b; -> 메소드안에서 초기화값이 지정되지 않아 오류 발생
//		int b = 20;
//		String e = null;
//		System.out.println(a);
//		System.out.println(b);
//		MyTest t = new MyTest();
//		System.out.println(t.c);
//		System.out.println(t.d);
//		System.out.println(e);
		
		byte a10 = Byte.MAX_VALUE;
		System.out.println(a10);
		int a11 = Integer.MAX_VALUE;
		System.out.println(a11);
		int a12  = a10 ;
		System.out.println(a12);
		byte a13 = (byte)a11; //type cast 
		System.out.println(a13);
		int a14 = 100;
		byte a15 = (byte)a14;
		System.out.println(a15);
		int i = 91234567;
		float f = (float)i; //i를 float 형으로 변환
		int i2 =(int)f; // float을 int로 변환 
		System.out.printf("i=%d\n", i);
		System.out.printf("f = %f i2=%d\n", f, i2);
		

	}

}
