package primefinder;

import java.util.ArrayList;

public class primefinder {

	public static void main(String[] args) {
		
		int n = 100000;
		
		ArrayList<Float> primes = new ArrayList<Float>();
		primes.add(2f);
		
		float i = 3f;
		boolean check = true;
		
		while(i < n) {
			check = true;
			for (float prime : primes) {
				if (i / 2 >= prime){
					if (i % prime == 0) {
					check = false;
					continue;
				}
				}
				else {
					continue;
				}
			}
			if (check){
				primes.add(i);
			}
			i++;
		}
		System.out.println(primes);  // Does seem to mess up with Eclipse IDE, not sure why
		System.out.print(primes.size());  // 9592 as expected
	}

}
