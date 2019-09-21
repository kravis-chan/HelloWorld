public class Pyramid{
	publicstatic void main(String[] args){
		int i = 5;
		for (int j = 1;j <= i; j++) {
			int times = j;
			while (times != 0) {
				System.out.println("*");
				times--;
			}
			System.out.println("\n");
		}
	}
}