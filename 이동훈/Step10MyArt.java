/*작품 내용
 * 1. 오늘 배운 내용에 한해서 3개의 메소드를 개발
 * 2. 반복 , 조건 등에 대한 연습이 도리 수 있는 하나의 lab 개발
 * 3. 마음 : 내 짝꿍을 생각하는 마음...
 * 
 */


package step01.syntax;
import java.util.Scanner;


public class Step10MyArt {

	static int x=5;
	static int y=15;
	
	public static void drawGround(int row,int column,int chX,int chY)
	{
		x=chX;
		y=chY;
		char rec = '□';
		char rec2= '■';
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				
				if(i==x&&j==y)
					makeCharacter('*');
				else
				{
					if(i==0||j==0||i==row-1||j==column-1)
						System.out.print(rec2);
					else
						System.out.print(rec);
				}
					
			}
			System.out.println();
		}
	}
	public static void makeCharacter(char ch)
	{
		System.out.print(ch);
	}
	public static void moveCharacter(char direction,int value)
	{
		if(direction=='r')
		{
			y=y+value;
		}
		else if(direction=='l')
		{
			y=y-value;
		}
		else if(direction=='u')
		{
			x=x-value;
		}
		else if(direction=='d')
		{
			x=x+value;
		}
		
		drawGround(10,31,x,y);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String direction;
		String value;
		char dir;
		
		int val;
		int count=0;
		while(true)
		{
			Scanner scan = new Scanner(System.in);  
			
	        
	        if(count==0)
			{
	        	System.out.println("＊교실 돌아다니는 짝꿍＊");
				dir='r';
				val=0;
			}
	        else {
	        	System.out.println("움직일 방향(r,l,u,d)과 이동 거리(1~5)를 입력하세요:");  
	        	direction = scan.next();
	        	value = scan.next();
	        	dir = direction.charAt(0);
	        	val = Integer.parseInt(value);
	        }
	        	if(dir=='r'||dir=='l'||dir=='u'||dir=='d'&&(val>=1&&val<=5))
	        	{
	        		moveCharacter(dir,val);
	        	}
	        	else if(dir!='r'||dir!='l'||dir!='u'||dir!='d')
	        		System.out.println("방향을 올바르게 입력하세요");
	        	else if(val>5||val<1)
	        		System.out.println("이동거리를 올바르게 입력하세요");
	        
	        count++;
			
		}
	}

}
