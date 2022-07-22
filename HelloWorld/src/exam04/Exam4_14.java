package exam04;

public class Exam4_14 {

	public static void main(String[] args) {
		int answer = (int) (Math.random()*100)+1;
		int input = 0 ; // 사용자 입력을 저장할 공간
		int count = 0 ; // 시도횟수를 세기 위한 변수
		
		// 화면으로부터 사용자 입력을 받기 위해서 scanner 클래스 사용
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do { 
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 :");
			input = s.nextInt(); // 입력받은 값을 변수 input에 저장한다.
			if(answer > input) {
				System.out.println("더 큰값을 입력하세요.");
			}else if(answer < input) {
				System.out.println("더 작은값을 입력하세요.");
			
			}else {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는"+count+" 번입니다.");
				break;
			}
			
		
		

		}while(true);
		
	}

}
