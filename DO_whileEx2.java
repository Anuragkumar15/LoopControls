
public class DO_whileEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String choice;
		do {
			System.out.println("Enter a number : ");
			int a = sc.nextInt();
			System.out.println("Square of the number : "+a*a);
			
			System.out.println("Do you want to continue[yes/no]");
			choice = sc.next();
			
		}while(choice.equalsIgnoreCase("yes"));
		System.out.println("Thanks for using the app");
		sc.close();
		}
	}


