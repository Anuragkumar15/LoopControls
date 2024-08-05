
public class Loop_assignment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the number : ");
		int x  = sc.nextInt();
		int y = sc.nextInt();
		for(int i=x;i<=y;i++) {
		int a = i;
		boolean flag = true;
		for(int j= 2;j<=a/2;j++) {
			if(a%j==0) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println(i+" Prime no.");
		}
//		else {
//			System.out.println("Not a prime no.");
//		}
		}
		
		sc.close();
	}

}
