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
			System.out.println("==�α��� ������ ==");
			System.out.println("1. �α��� 2. ȸ������ 0. ����");
			
			int input;
			Member nmem;

			input = sc.nextInt();
			
			switch(input) {
				case 1: log_flag=log.login(); 
						if(log_flag==false) {
							System.out.println("�α��ο� �����Ͽ����ϴ�");
						}
						else {}
						break;				
				case 2: jn.register();
						break;
				
				case 0: System.out.println("���α׷��� �����մϴ�.");
						return;
				default : System.out.println("�߸� �Է��Ͽ����ϴ�");
			}
		}
	}
}
