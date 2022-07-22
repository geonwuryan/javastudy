package exam04;

public class exam4_12 {

	public static void main(String[] args) {
		for(int i=2;i<=9;i+=3) {
			for(int j=1;j<=3;j++) {
				int y=i;
				for(int x=1;x<=3;x++) {
					if(y>=10) continue;
					System.out.print(y+"*"+j+"="+y*j+"\t");
					y++;
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
