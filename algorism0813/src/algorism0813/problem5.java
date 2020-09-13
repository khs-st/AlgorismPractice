package algorism0813;

public class problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++ ) {
				System.out.print(String.format("%d"+"x"+"%d"+"="+"%2d  ",i,j,i*j));
			}
			System.out.println();
		}
	}

}
