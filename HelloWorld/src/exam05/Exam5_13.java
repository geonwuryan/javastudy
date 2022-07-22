package exam05;

import java.util.Scanner;

public class Exam5_13 {

	public static void main(String[] args) {
		String[]word = {"김건우천재", "고한교바보","남주연메롱","이동민멍청이","김범년똥개"};
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0 ; i< word.length; i++) {
			char [] question = word[i].toCharArray(); // String -> char 
			for(int j =0; j <question.length;j++) {
				int idx = (int)(Math.random()*question.length);
				char tmp = question[i];
				question[i] = question[idx];
				question[idx]=tmp;
			}
			
			System.out.printf("Q%d. %s의 정답을 입력하세요.>", i+1, new String(question));
			
			String answer = scanner.nextLine();
			
			//trim()으로 answer의 좌우 공백을 제거한 후, equals로 word[i]와 비교
			if(word[i].equals(answer.trim()))
				System.out.println("맞았습니다.%n%n");
			else
				System.out.println("틀렸습니다.%n%n");
			}
			
			
		}
		

	}
