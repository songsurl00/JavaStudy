import java.util.Scanner;

public class AuthApp3 {

	public static void main(String[] args) {
		
		String users[][] = {
				{"egoing", "1111"}, 
				{"jinhuck", "2222"}, 
				{"youbin", "3333"}};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("ID: ");
		String inputId = scanner.next();
		System.out.println("Password: ");
		String inputPass = scanner.next();
		
		boolean isLogined = false;
		for(int i=0; i<users.length; i++) {
			String current[] = users[i];
			if(current[0].equals(inputId) && current[1].equals(inputPass)) {
				isLogined = true;
				break;
			}
		}
		System.out.println("Hi,");
		if (isLogined) {
			System.out.println("Master!!");
		} else {
			System.out.println("Who are you?");
		}
		
		scanner.close();
	}

}
