package exam04;

public class Exam4_15 {

	public static void main(String[] args) {
		int number = 54321;
		int tep = number;
		
		int result =0;
		while(tep !=0) {
			result = result*10 + tep%10;
			tep /= 10;
			
		}
		if (number == result)
			System.out.println(number + "는 회문수 입니다.");
		else
			System.out.println(number + "는 회문수가 아닙니다.");

	}

}
