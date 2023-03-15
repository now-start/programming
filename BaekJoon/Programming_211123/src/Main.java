import java.io.*;
import java.util.StringTokenizer;

// 1016
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());

		long min = Long.parseLong(st.nextToken());
		long max = Long.parseLong(st.nextToken());

		int result = (int) (max - min + 1);
		int sqrt = ((int) Math.sqrt(max));

		boolean[] checks = new boolean[result];

		for (long i = 2; i <= sqrt; i++) {
			long squared = i * i;
			long start = min % squared == 0 ? min / squared : (min / squared) + 1;
			for (long j = start; j * squared <= max; j++) {
				checks[(int) ((j * squared) - min)] = true;
			}
		}

		int count = 0;
		for (int i = 0; i < result; i++) {
			if (!checks[i]) {
				count++;
			}
		}

		bw.write(count + "");
		bw.flush();
	}

}
