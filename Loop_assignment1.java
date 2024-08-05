
public class Loop_assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = sc.nextInt();
		int fact = 1;
		for(int i = 1;i<=a;i++) {
			if(a == 0 || a == 1) {
//				System.out.println(fact);
			}else {
				fact *=i;
			}
			
		}
		System.out.println(fact);
		
		sc.close();
	}

}
