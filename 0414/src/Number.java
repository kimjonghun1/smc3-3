import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("10���� ���� ���� �� �ϳ��� ���纸����(1~50) : ");
		int b = sc.nextInt();
		int c=0;
		for(int i=0;i<10;i++) {
			int a = (int)(Math.random()*50+1);
		
			System.out.print(a+" ");
			if(b==a){
				c++;
			}
		}
		
		if(c==1) {
			System.out.println("\n"+"����");
		}else System.out.println("\n"+"��");
		

	}

}
