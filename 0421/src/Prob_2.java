import java.util.Scanner;

public class Prob_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1000 ������ �ڿ����� �Է��ϼ���.");
		int a=sc.nextInt();
		int sum=0;
		for(int i=1;i<=a;i++) {
			if(i%4==0) {
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println("1~"+a+"���� 4�� ����� ���� "+sum+"�Դϴ�.");
	
		

	}

}
