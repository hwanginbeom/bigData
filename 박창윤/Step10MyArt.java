package step01.syntax;

public class Step10MyArt {
		public static String AttendPF(int value) {
			String retVal ="미등록";
			
			if(value>=400) {
				retVal="개근";
			}else if(value>=391){
				retVal="지각";
			}else if(value>=360){
				retVal="결석 5회 이하";
			}else if(value>=320){
				retVal="결석 10회 이하";
			}else if(value>=280){
				retVal="미수료 위기";
			}else {
				retVal="미수료";
			}
			
			
			return retVal;
		}
		
		
		
		public static void main(String[] args) {
			System.out.println(AttendPF(255));
			System.out.println(AttendPF(400));
			System.out.println(AttendPF(350));
			System.out.println(AttendPF(285));
			System.out.println(AttendPF(392));
			System.out.println(AttendPF(252));
			

		}
}
