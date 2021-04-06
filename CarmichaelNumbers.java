import java.math.BigInteger;
import java.io.*; 

public class CarmichaelNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printCarmichaelNumbers(10000);

		
	}
	public static void printCarmichaelNumbers(long n) {
		for(long i=0; i<n; i++) {
			if(isCarmichaelNumber(i)==true) {
				System.out.println(i);
			}
		}
	}
	public static boolean isCarmichaelNumber(long n) {

		if(n<=2 || n%2==0 || isPrimeBigInt(n)==true) {
			return false;
		}
		for(long a = 3; a<n;a++) {
			if(gcd(a,n)==1) {
				if(FastPowerModPower(a,n-1,n)!=1) {
					return false;
				}
			}
		}
		return true;
	}
	public static long FastPowerModPower(long x, long y, long mod) {
		BigInteger x1 = BigInteger.valueOf(x);  
		BigInteger y1 = BigInteger.valueOf(y);  		
		BigInteger mod1 = BigInteger.valueOf(mod);  
		if(y1.equals(BigInteger.ZERO)) {
			return 1;
		}
		return x1.modPow(y1, mod1).longValue();
	}
	public static boolean isPrimeBigInt(long n) {
		BigInteger x1 = BigInteger.valueOf(n);  
		if(x1.isProbablePrime(1)==true) {
			return true;
		}
		return false;
	}
	public static long gcd(long a, long b) {
		BigInteger b1 = BigInteger.valueOf(a);
		BigInteger b2 = BigInteger.valueOf(b);
		BigInteger gcd = b1.gcd(b2);
		return gcd.longValue();
	}
	
}
