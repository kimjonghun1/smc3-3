import java.util.Scanner;

public class Prob_1 {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			int sum=0;
			System.out.print("���� ����: ");
			int a=sc.nextInt();
			System.out.print("������ ����: ");
			int b=sc.nextInt();
			for(int i=a;i<=b;i++) {
				sum+=i;
			}
			System.out.println(a+"���� "+b+"������ ���� "+sum);
			
			
			
			
			
			}
		
		}

	