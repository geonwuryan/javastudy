package exam04;

public class Exam4_4 {

	public static void main(String[] args) {
		int sum = 0;
		int s = 1;
		int num = 0;
		
		for(int i = 1; true ; i++, s=-s) {
			num = s * i;
			sum += num;

		if(sum >= 1000)
			break;
		System.out.println(num);
		}
	}


}
