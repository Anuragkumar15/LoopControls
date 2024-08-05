
public class Loop_assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int c = 0;
		int sum = 0;
		int d;
		while(n!=0) {
			d = n%10;
			sum+=d;
			n = n/10;
		}
		System.out.println(sum);
		sc.close();
	}

}
