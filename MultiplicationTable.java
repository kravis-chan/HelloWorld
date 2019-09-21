public class MultiplicationTable{
	public static void main(String[] args) {
		int sum = 1;
		for(int i = 1;i <= 9; i++;){
			for(int j = i;j <= 9;j++){
				System.out.println(" %d * %d = %d " ,i,j,i * j);
				if(j == sum ) {
					System.out.println("\n");
					break;
				}
				else{
					System.out.println();
					}
			}
			sum++;
		} 
	}
}