package login;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Login {
	
	boolean login() {
		String filename ="accs/account.text";
		List<Member> account = new ArrayList<Member>();
		Scanner sc = new Scanner(System.in);
		
		String uid;
		String upw;

		System.out.println("id를 입력하세요:");
		uid=sc.next();
		System.out.println("pw를 입력하세요:");		
		upw=sc.next();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			String sen;
			String id, pw, name;
			
			while((sen=br.readLine())!=null) {
				Member inM = new Member();
				String[] temp = sen.split("/");
				id =temp[0];
				pw =temp[1];
				name=temp[2];
				inM.setId(id);
				inM.setPw(pw);
				inM.setName(name);
				account.add(inM);
			}
				br.close();
			
			for(Member mem : account ) {
				if(mem.getId().equals(uid)) {
					if(mem.getPw().equals(upw)) {
						System.out.println("로그인성공");
						System.out.println(mem.getName()+"님 로그인을 환영합니다");
						return true;
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
