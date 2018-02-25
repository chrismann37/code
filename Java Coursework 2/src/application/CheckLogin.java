package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckLogin {
	private String username;
	private String password;
	
	public CheckLogin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public boolean login() {
		File file = new File("login.txt");
		
		try (Scanner input = new Scanner(file)) {
			String line = input.nextLine();
			String[] split = line.split(":");
			if (username.equals(split[0].trim()) && password.equals(split[1].trim())) {
				return true;
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		return false;
	}
}
