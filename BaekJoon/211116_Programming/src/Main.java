import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

// 18258
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> deque = new LinkedList<Integer>();

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			
			switch(s) {
			case "push":
				deque.add(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				if(deque.isEmpty()) {
					bw.write("-1" + "\n");
				}else {
					bw.write(deque.pop() + "\n");
				}
				break;
			case "size":
				bw.write(deque.size() + "\n");
				break;
			case "empty":
				if(deque.isEmpty()) {
					bw.write("1" + "\n");
				}else {
					bw.write("0" + "\n");
				}
				break;
			case "front":
				if(deque.isEmpty()) {
					bw.write("-1" + "\n");
				}else {
					bw.write(deque.getFirst() + "\n");
				}
				break;
			case "back":
				if(deque.isEmpty()) {
					bw.write("-1" + "\n");
				}else {
					bw.write(deque.getLast() + "\n");
				}
				break;
			}
		}
		
		bw.flush();
	}

}
