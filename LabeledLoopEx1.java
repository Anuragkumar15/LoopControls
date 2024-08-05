
public class LabeledLoopEx1 {
	public static void main(String[] args) {
		ram:
			for(int i=1;i<=3;i++) {
				System.out.println("Hello");
				lakshman:
					for(int j=1;j<=4;j++) {
						System.out.println("Hi");
						if(j==2) {
							//break;
							break ram;
						}
						System.out.println("incapp");
					}
			}
		System.out.println("India");
	}
}
