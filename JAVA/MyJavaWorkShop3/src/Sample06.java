class MyString {}
public class Sample06 {

	public static void main(String[] args) {
		//Reference Type
		// String 
		String name = "����"; // new Sring (...)
	//	MyString str = new MyString();
		String name2 = "����"; 
		boolean check = (name == name2)? true : false;
		System.out.println(check);
		String name3 = new String("����"); //���ο� ��ü[������] ����
		boolean check2 = (name.equals(name3))? true : false;
		System.out.println(check2); //false ������ ������ ���δٸ� ��ü�̱� ������ ������ ���ϱ� ���ؼ� equals()��� 
		
		MyClass m = new MyClass();
		MyClass m2 = m;
		boolean check3 = (m2 == m)? true : false;
		System.out.println(check3);
		
		MyClass m3 = new MyClass();
		boolean check4 = (m3 == m)? true : false;
		System.out.println(check4);
		
	}

}

class MyClass {}