import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//1339
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		char alpha[] = new char[10];
		int count[] = new int[10];

		// main
		for (int i = 0; i < n; i++) {
			String s = bf.readLine();
			int temp = 1;
			for (int j = s.length() - 1; j >= 0; j--) {
				for (int k = 0; k < alpha.length; k++) {
					if (alpha[k] == '\u0000') {
						alpha[k] = s.charAt(j);
						count[k] = temp;
						break;
					} else if (alpha[k] == s.charAt(j)) {
						count[k] += temp;
						break;
					}
				}
				temp *= 10;
			}
		}

		int sum = 0;
		Arrays.sort(count);
		for (int i = count.length - 1; i >= 0; i--) {
			sum += i * count[i];
		}
		System.out.println(sum);
	}

}
