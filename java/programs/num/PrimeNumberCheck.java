package programs.num;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        int num = 121;
        if (isPrime(num)) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }

    public static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

		/*if (n % 2 == 0 || n % 3 == 0) {
			return false;
		}
		for (int i = 5; i * i <= n; i = i + 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;*/
    }
}