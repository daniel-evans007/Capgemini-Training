package day1;

public class AbundantPerfectDeficient {

	public static void main(String[] args) {
		
		for (int i=1;i<10000;i++) {
			int sum = 0;
			int num = i;
			
			for (int j=1;j<=(num/2);j++) {
				if (i%j == 0) {
					sum += j;
				}
			}
			
			if (sum == i) {
				System.out.println(i+" is Perfect");
			}
			else if (sum < i) {
				System.out.println(i+" is Deficient");
			}
			else {
				System.out.println(i+" is Abundant");
			}
		}
	}
}