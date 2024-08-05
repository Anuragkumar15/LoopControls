
public class Loop_assignment11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String choice;
		do {
			System.out.println("Enter a number : ");
			int a = sc.nextInt();
			if(a%2==0) {
				System.out.println("Even number");
			}
			else {
				System.out.println("Odd number");
			}
			System.out.println("Do you want to continue[yes/no]");
			choice = sc.next();
		}while(choice.equalsIgnoreCase("yes"));
		System.out.println("Thanks for using the app");
		
		sc.close();
	}

}
