
public class whileEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int c = 0;
		while(n!=0) {
			n = n/10;
			c++;
		}
		System.out.println("Digits : "+c);
		sc.close();
		}
	}


