
public class Sample03 {

	public static void main(String[] args) {
		int a = 0;
		a++; // a = a+1;
		System.out.println(a);
		int b = 0;
		int c = b++; //��ġ���� ȣ���̸����ǰ� ���� 
		System.out.println(c);
		System.out.println(b);
		
		int d =0;
		++d; // ������Ű�� ȣ���
		System.out.println(d);
		int e = 0;
		int f = ++e;
		System.out.println(f);
		System.out.println(e);
		// ���� ������ 
		int h = 10;
		System.out.println(h++); 
		System.out.println(h);
		System.out.println(++h);
		// ���ҿ����� 
		int h1 = 10;
		System.out.println(h1--);
	//	System.out.println(h1);
		System.out.println(--h1);
		
		int i1 =10;
		int j =10;
		
		System.out.println(i1++ + ++i1); 
		System.out.println(j++ + j++);
		int a1 = 10;
		int b1 = -10;
		
		System.out.println(~a1);
	System.out.println(Integer.toBinaryString(a1));
	System.out.println(Integer.toBinaryString(~a1));
	boolean c1 = true;
	boolean d1 = false;
	System.out.println(!c1); //!�� not�� �ǹ� 
	System.out.println(!d1);
		
	int e1 = 10;
	int f1 = 3;
	System.out.println(e1 % f1);
	
	int g = 100;
	int h2 =200;
	
	System.out.println(g ==h2 );
	System.out.println(g != h2);
	System.out.println(g > h2);
	System.out.println(g < h2);
	System.out.println(g >= h2);
	System.out.println(g <= h2);
	
	// and (&&), or(||)
	
	
	boolean i2 = (g ==h2);
	System.out.println(i2);
	
	boolean j2 = (g ==h2) && (g !=h2);
	//false and true
	System.out.println(j2);
	boolean k = (g==h2) || (g !=h);
	System.out.println(k);
	
	boolean l = ((g ==h2) && (g !=h2)) || ((g ==h2)|| (g !=h));
	System.out.println(l);
	
	}

}
