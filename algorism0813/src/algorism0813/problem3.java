package algorism0813;

import java.util.Scanner;

public class problem3 {

	public static void Swap(int a, int b) {
		int c;
		c = a;
		a = b;
		b = c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1, x2, y1, y2, r1, r2;
		int T, distinct, numintersection = 0;
		System.out.print("��� �����Ͻðڽ��ϱ�? ");
		Scanner scanT = new Scanner(System.in);
		T = scanT.nextInt();
		for (int i = 0; i < T; i++) {
			System.out.print("x1,x2,y1,y2,r1,r2�� �Է��Ͻÿ�.(�Է� �� ���͸� �����ÿ�)");
			Scanner scanx1 = new Scanner(System.in);
			Scanner scanx2 = new Scanner(System.in);
			Scanner scany1 = new Scanner(System.in);
			Scanner scany2 = new Scanner(System.in);
			Scanner scanr1 = new Scanner(System.in);
			Scanner scanr2 = new Scanner(System.in);
			x1 = scanx1.nextInt();
			x2 = scanx2.nextInt();
			y1 = scany1.nextInt();
			y2 = scany2.nextInt();
			r1 = scanr1.nextInt();
			r2 = scanr2.nextInt();
			distinct = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);

			if (r1 < r2) {
				Swap(r1, r2);
			}
			
			if(distinct==(r1+r2)*(r1+r2)) {
				numintersection=1; //������ ��
			
			}
			else if(distinct>(r1-r2)*(r1-r2)&&distinct<(r1+r2)*(r1+r2)) {
				numintersection=2; // �������� ���� ��
			}
			else if(r1==r2&&distinct==0) {
				numintersection=-1; //�յ��� ��(��ġ�� ������ ���Ѵ��̴�.)
			}
			else if(distinct>(r1+r2)*(r1+r2)) {
				numintersection=0; //������ ���� �� (�Ÿ��� �־)
			}
			else if(distinct==(r1-r2)*(r1-r2)&&distinct!=0) {
				numintersection=-1; //������ �� ( �̶� distinct==0�̸� �յ��� ����̴�.)
			}
			else if(distinct<(r1-r2)*(r1-r2)) {
				numintersection=0; //�� ���� �ٸ� ���� ���ԵǾ� ������ ���� ��
			}
			System.out.println(numintersection);
		}
		
	}

}
