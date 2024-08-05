
public class Loop_assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int a = n;
		int b = n;
		int c = 0;
		while(n!=0) {
			n = n/10;
			c++;
		}
		int sum =0;
		while(a!=0) {
			int d = a%10;
			sum = sum + (d*d*d);
			a = a/10;
			
		}
		if(b==sum) {
			System.out.println("Armstrong number");
			
		}else {
			System.out.println("Not a armstrong number");
		}
		
		sc.close();
	}

}
