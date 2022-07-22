package exam04;

public class Exam4_11 {

	public static void main(String[] args) {
		// Fabonnaci 수열의 시작의 첫 두숫자를 1, 1 로 한다.
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		System.out.println(num1+","+num2);
		
		for(int i = 0; i <8; i++) {
			num3 = num1+num2;
			System.out.println(","+num3);
			num1 = num2;
			num2 = num3;
			
			}
		}

	}
