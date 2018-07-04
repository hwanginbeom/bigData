//다형성 익숙해 지기 
package step03.apply;

public class PolyTest extends Object{

	public PolyTest() {
		super();
	}
	
	//문자열 객체 생성후 Object(최상위) 타입으로 반환
	//Object 변수 = "문자열";와 상동
	public static Object getData() {
		return "문자열";//String 객체 생성 -> 반환
	}
	public String toString() {
		return "김";
	}
	public static void main(String[] args) {
		PolyTest p = new PolyTest();
		System.out.println(p);
		System.out.println(p.toString());
		
		String data = (String)getData();
		System.out.println(data);
		System.out.println(data.toString());
		
		Integer i = new Integer(33);
		System.out.println(i);
		System.out.println(i.toString());
		
		System.out.println(data.charAt(0));
		
		//오류 : Object 가 상속시키지 않은 변수, 메소드는 Object
		//타입이 access(호출) 불가
		//실행 순서 : getData() -> getData().charAt(0) -> (String)
		//System.out.println((String)getData().charAt(0));
		
		System.out.println(( (String)getData() ).charAt(0));
	}

}




