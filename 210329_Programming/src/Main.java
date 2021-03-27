import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		String p = "I";
		String s = br.readLine();

		for (int i = 0; i < n; i++) {
			p += "OI";
		}

		for (int i = 0; i < m; i++) {
			for(int j=i;j<n;j++) {
				
			}
		}

	}

}
