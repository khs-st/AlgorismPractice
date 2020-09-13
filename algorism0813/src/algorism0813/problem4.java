package algorism0813;

public class problem4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fibo[]=new int[20];
		fibo[0]=1;
		fibo[1]=1;
		
		for(int i=2; i<fibo.length; i++) {
			fibo[i]=fibo[i-1]+fibo[i-2];
		} //피보나치 수열 만들기
		
		for(int i=0; i<fibo.length; i++) {
			System.out.println(fibo[i]);
		}	//피보나치 수열 출력
	}

}
