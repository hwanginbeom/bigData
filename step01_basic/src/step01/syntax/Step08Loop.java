/* �н�����
 * 1. �ݺ���
 * 		1. for : �ݺ� Ƚ���� ��Ȯ�Ҷ� �ַ� ��� 
 * 				    ���ǽ��� true�� ��츸 ����
 * 		2. while : ���� ����, �ݺ�Ƚ���� �Ҹ�Ȯ�� �� �ַ� ���
 * 					���ǽ��� true�� ��츸 ����
 * 		3. do~while : �ݺ�Ƚ���� �Ҹ�Ȯ�� �� �ַ� ���, 
 * 							 ������ 1�� �̻� �����ؾ� �� ��� ���� */

package step01.syntax;

public class Step08Loop {
	//for - 1~5���, Ű������ tab�� ������ Ű���� "\t"
	/* 1~5���� �������� ������ �����ϰ� �Ǵ� ����
	 * 1~ 1�� ������Ű�� ����
	 * �������� 5�� ���ؼ� 6�̶�� ����...�� ���ǽ�
	 * for(�ʱ��; ���ǽ� ; ������){
	 *    ���ǽ��� true�� ��� ����Ǵ� ����
	 * }
	 *  */
	public static void forTest() {
		for(int i=1; i <= 5; i++) {  //i = i+1; ������ ����
			System.out.print(i + "\t");
		}
	}
	public static void forTest2() {
		for(int i=1; i <= 5; i++) {  
			System.out.print('*' + "\t");
		}
	}
	//�ݺ��ϴ� �� ��ŭ ������ ����(����, ����)�ؼ� ���
	public static void forTest3() {
		char star = '*';
		String star2 = "";
		for(int i=1; i <= 5; i++) {  
			star2 = star2+star;  
			System.out.println(star2);
		}
	}
	public static void forTest4() {
		char star = '*';
		//�ټ� ������ �����ϱ� ���� �ݺ���
		for(int lineCount=1; lineCount <= 5; lineCount++) {
			//�� ���ο��� ���� ��� ���� ���� �ݺ���
			for(int starCount=5; starCount >= lineCount; starCount--) {
				System.out.print(star);		
			}//end of inner for
			System.out.println();
		}//end of out for
	}
	public static void forTest5() {
		char star = '*';
		String star2 = "";
		for(int lineCount=1; lineCount <= 5; lineCount++) {
			for(int starCount=5; starCount >= lineCount; starCount--) {
				star2 = star2+star;	
			}//end of inner for
			System.out.println(star2);
			star2 = "";//�ʱ�ȭ �ʼ�
		}//end of out for
	}
	
	//while
	public static void whileTest() {
		int no = 1;
		while(no < 6) {
			System.out.print(no + "\t");
			//no = no+1;
			no++;
		}
	}
	//do~while
	public static void doWhileTest() {
		int no = 1;
		do{
			System.out.print(no + "\t");
			no++;
		}while(no < 6);
	}
	
	public static void main(String[] args) {
		whileTest();
		System.out.println();
		doWhileTest();
		
		
		//step01 - for
	/*	Step08Loop.forTest();
		System.out.println("\n--- 2. * ���");
		forTest2();
		System.out.println("\n--- 3. * �������");
		forTest3();
		System.out.println("\n--- 4. * �Ųٷ� ���");
		forTest4();
		System.out.println("\n--- 5. * �Ųٷ� ���");
		forTest5();*/
		
		
	}

}