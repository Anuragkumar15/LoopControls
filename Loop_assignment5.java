
public class Loop_assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int a = n;
		int rev =0;
		while(a!=0) {
			int d = a%10;
			rev = (rev*10)+d;
			a = a/10;
		}
		if(n==rev) {
			System.out.println("palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
		sc.close();
	}

}
