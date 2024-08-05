
public class Loop_assignment12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String choice;
		do {
			System.out.println("Enter the number : ");
			int a = sc.nextInt();
			boolean flag = true;
			for(int i= 2;i<=a/2;i++) {
				if(a%i==0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println("Prime no.");
			}else {
				System.out.println("Not a prime no.");
			}
			System.out.println("Do you want to continue[yes/no]");
			choice = sc.next();
		}while(choice.equalsIgnoreCase("yes"));
		System.out.println("Thanks for using the app");
		
		sc.close();
	}

}
