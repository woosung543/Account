package login;

import java.util.Scanner;

public class Log_main {
	public static void main(String[] args) {
//		List<Member> account = new ArrayList<Member>();
		Login log = new Login(); 
		Join jn = new Join();
		Boolean log_flag;
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("==로그인 페이지 ==");
			System.out.println("1. 로그인 2. 회원가입 0. 종료");
			
			int input;
			Member nmem;

			input = sc.nextInt();
			
			switch(input) {
				case 1: log_flag=log.login(); 
						if(log_flag==false) {
							System.out.println("로그인에 실패하였습니다");
						}
						else {}
						break;				
				case 2: jn.register();
						break;
				
				case 0: System.out.println("프로그램을 종료합니다.");
						return;
				default : System.out.println("잘못 입력하였습니다");
			}
		}
	}
}
