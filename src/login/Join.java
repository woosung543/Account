package login;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Join {
	
	public void register() {
		String fileName = "accs/account.text";
		String id, pw, name;
		Scanner sc = new Scanner(System.in);
			System.out.println("���ϴ� id�� �Է����ּ���");
			id = sc.next();
			System.out.println("���ϴ� pw�� �Է����ּ���");
			pw = sc.next();
			System.out.println("���ϴ� �̸��� �Է����ּ���");
			name = sc.next();
			
			String txt = id + "/" + pw +"/"+name;
			try {
				BufferedWriter br = new BufferedWriter(new FileWriter(fileName, true));
				
				br.write(txt);
				br.write("\n");
				br.flush();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("ȸ������ �Ǿ����ϴ�.");
	}
}
