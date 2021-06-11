class MyString {}
public class Sample06 {

	public static void main(String[] args) {
		//Reference Type
		// String 
		String name = "순신"; // new Sring (...)
	//	MyString str = new MyString();
		String name2 = "순신"; 
		boolean check = (name == name2)? true : false;
		System.out.println(check);
		String name3 = new String("순신"); //새로운 객체[힙영역] 생성
		boolean check2 = (name.equals(name3))? true : false;
		System.out.println(check2); //false 내용은 같지만 서로다른 객체이기 때문에 내용을 비교하기 위해서 equals()사용 
		
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