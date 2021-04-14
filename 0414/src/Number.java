import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("10개의 랜덤 숫자 중 하나를 맞춰보세요(1~50) : ");
		int b = sc.nextInt();
		int c=0;
		for(int i=0;i<10;i++) { // 랜덤으로 띄우며 입력받은 값과 
			int a = (int)(Math.random()*50+1);
		
			System.out.print(a+" ");
			if(b==a){
				c++;
			}
		}
		
		if(c==1) {
			System.out.println("\n"+"성공");
		}else System.out.println("\n"+"꽝");
		

	}

}
