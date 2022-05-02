
public class PrimeNumber {

	static boolean isPrime(int n) {
		for(int i=2;i<n;i++) {
			if (n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			if(isPrime(i)==true)
				System.out.print(i+" ");
		}

	}

}
