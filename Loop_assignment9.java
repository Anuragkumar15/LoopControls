
public class Loop_assignment9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the number : ");
		int r1 = sc.nextInt();
		int r2 = sc.nextInt();
		for(int i=r1;i<=r2;i++) {
		int n = i;
		int copy = n;
		int sum =0;
		int c = 0;
		while(n!=0) {
			n = n/10;
			c++;
		}
		n = copy;
		while(n!=0) {
			int d = n%10;
			int m = 1;
			for(int a = 1;a<=c;a++) {
				m*=d;
			}
			sum += m;
			n=  n/10;
		}
	
		if(copy==sum) {
			System.out.println(i+" Armstrong number");
		}
//		else {
//			System.out.println(i+" Not a armstrong number");
//		}
		n=copy;	
	}
	}

	}
	
