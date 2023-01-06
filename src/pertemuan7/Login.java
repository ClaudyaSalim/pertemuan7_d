package pertemuan7;

import java.util.Scanner;

public class Login {
	
	Scanner scan = new Scanner(System.in);

	public Login() {
		// code
		String password;
		System.out.println("Input password: ");
		password = scan.nextLine();
		
		try {
			check(password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Login();

	}

	public void check(String password) throws Exception { // function buat bikin exception custom
		if(password.equals("12345")) {
			System.out.println("Lanjut");
		}
		else {
			// lempar exception
			throw new Exception("Passwordnya salah"); // kasih pesan error
		}
	}
	
}
