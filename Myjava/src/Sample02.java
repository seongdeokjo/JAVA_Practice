class Student {
	public String name;
}
public class Sample02 {

	public static void main(String[] args) {
		/* Value Type
		int a = 10;
		int b = 20;
		int c = a; // c =10
		int d = b; // d =20
		System.out.println(d);
		*/
		// Reference Type 
		Student s = new Student();
		s.name = "ȫ's";
		// s���� s2�� ����� 
		Student s2 = s;
		System.out.println(s2.name);
		System.out.println(s.name);
		s2.name = "�̼���";
		System.out.println(s.name);
	}
	

}
