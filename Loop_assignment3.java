
public class Loop_assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		for(int i=0;i<n;i++) {
			int c = a+b;
			System.out.print(c+" ");
			a = b; 
			b = c;
		}
		
		
		sc.close();
	}

}
