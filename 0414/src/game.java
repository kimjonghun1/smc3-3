import java.util.Scanner;

public class game {
	public static void game(int user,int com) {
		switch(user) {
		case 1 : if(com==1) {
					System.out.println("[나 :가위   컴:가위]\n무승부");
				}else if(com==2) {
					System.out.println("[나 :가위   컴:바위]\n패배");
				}else System.out.println("[나 :가위   컴:보]\n승리");
				break;

		case 2 : if(com==1) {
					System.out.println("[나 :바위  컴:가위]\n승리");
				}else if(com==2) {
					System.out.println("[나 :바위  컴:바위]무승부");
				}else System.out.println("[나 :바위  컴:보]페베");
				break;
		case 3 : if(com==1) {
					System.out.println("[나 :보  컴:가위]페베");
				}else if(com==2) {
					System.out.println("[나 :보  컴:바위]승리");
				}else System.out.println("[나 :보  컴:보]무승부");
				break;
		default : System.out.println("잘못 입력했습니다");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("[1: 가위 2: 바위 3: 보] ");
		int a = sc.nextInt();
		int b = (int)(Math.random()*3+1);
		game(a, b);

	}

}
