import java.until.Scanner;

public class GuessAge{
	public static void main(String[] args){
		
		int age = scan.nextInt();
		int check = age / 18;
		
		switch( check ){
			case 0 :
					System.out.println("youngersister");
					break;
			case 1 :
					System.out.println("olderersister");
					break;
			default :
					System.out.println("oldestsister");
					break;
		}
	}
}