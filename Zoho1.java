import java.util.Scanner;

public class Zoho1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char [] s = sc.next().toCharArray();
		int n = s.length;

		for (int i=0; i<n; i++) {
			int m = s.length/2;
			for(int j = 0; j<n; j++){
				if(j>=n-i-1){
					System.out.print(s[m%n]);
					m++;
				}
				else System.out.print(" ");
			}
			System.out.println();
		}

	}
}