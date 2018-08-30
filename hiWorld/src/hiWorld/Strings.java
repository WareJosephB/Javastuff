package hiWorld;

public class Strings {
	public static void main(String[] args) {
		String a = "Foo";
		String b = "Bar";
		int c = 0;
		int d = 5;
		while (c<d) {
			c = c + 2;
			System.out.println(a+" "+b+" "+c);
			System.out.println(c);
		}
		{
		int[] arr = {1, 2, 3, 4, 5};
		for (int el : arr) {
			if (el == 4){
				continue;
			}
			System.out.println(el*el + " = "+el+"^2");
		}
		}
		int i = 1;
		int j = 10;
		while (i < j) {
			System.out.println(a);
			i++;
			if (i == 2) {
				break;
			}
		}
		System.out.println(b);
	}
}
