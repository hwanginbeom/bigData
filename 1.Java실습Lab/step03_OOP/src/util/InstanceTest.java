package util;

public class InstanceTest {
	public static void main(String[] args) {
		D d = new D();
		//? 더 이상의 객체 생성 문법 없이 	
		//no 변수값 출력하는 문법은?
		System.out.println(d.c.b.a.no);
		/* d.c.b.a.no
		 * d = D 객체
		 * d.c = C 객체
		 * d.c.b = B 객체
		 * d.c.b.a = A 객체
		 * d.c.b.a.no = A  객체의 no 변수 */
	}
}
class A{
	int no = 20;
	A(){
		System.out.println("A");
	}
}
class B{
	A a = new A();	
	B(){
		System.out.println("B");
	}
}
class C{
	B b = new B(); 
	C(){
		super();
		System.out.println("C");
	}
}
class D{
	C c = new C(); 
	D(){
		System.out.println("D");
	}
}



