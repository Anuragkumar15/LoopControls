
public class BreakEx5 {

	public static void main(String[] args) {
		System.out.println("hello");
		for(int a=1;a<=8;a++) {
			System.out.println("Anurag");
			if(a++ == 3) {
				break;
			}else {
				a++;
			}
			System.out.println("Kumar");
		}
		System.out.println("Bye");
		
	}

}
