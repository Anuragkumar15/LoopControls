
public class Loop_assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = sc.nextInt();
		int flag = 1;
		for(int i= 2;i<=a/2;i++) {
			if(a%i==0) {
				flag = 0;
				break;
			}
		}
		if(flag == 1) {
			System.out.println("Prime no.");
		}else {
			System.out.println("Not a prime no.");
		}
		
		sc.close();
	}

}
