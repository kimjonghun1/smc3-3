import java.util.Scanner;

public class game {
	public static void game(int user,int com) {
		switch(user) {
		case 1 : if(com==1) {
					System.out.println("[�� :����   ��:����]\n���º�");
				}else if(com==2) {
					System.out.println("[�� :����   ��:����]\n�й�");
				}else System.out.println("[�� :����   ��:��]\n�¸�");
				break;

		case 2 : if(com==1) {
					System.out.println("[�� :����  ��:����]\n�¸�");
				}else if(com==2) {
					System.out.println("[�� :����  ��:����]���º�");
				}else System.out.println("[�� :����  ��:��]�亣");
				break;
		case 3 : if(com==1) {
					System.out.println("[�� :��  ��:����]�亣");
				}else if(com==2) {
					System.out.println("[�� :��  ��:����]�¸�");
				}else System.out.println("[�� :��  ��:��]���º�");
				break;
		default : System.out.println("�߸� �Է��߽��ϴ�");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("[1: ���� 2: ���� 3: ��] ");
		int a = sc.nextInt();
		int b = (int)(Math.random()*3+1);
		game(a, b);

	}

}
